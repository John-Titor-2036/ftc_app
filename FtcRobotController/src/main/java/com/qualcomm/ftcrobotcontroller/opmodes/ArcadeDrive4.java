package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.ftcrobotcontroller.lib.ArcadeDriver4;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

/**
 * Arcade Drive
 *
 *
 */
public class ArcadeDrive4 extends OpMode {

    DcMotor motorLeftBack;
    DcMotor motorRightBack;
    DcMotor motorLeftFront;
    DcMotor motorRightFront;

    ArcadeDriver4 captain;

	public ArcadeDrive4() {

	}


	@Override
	public void init() {

        motorLeftBack = hardwareMap.dcMotor.get("motorLeftBack");
        motorRightBack = hardwareMap.dcMotor.get("motorRightBack");
        motorLeftFront = hardwareMap.dcMotor.get("motorLeftFront");
        motorRightFront = hardwareMap.dcMotor.get("motorRightFront");

        motorRightBack.setDirection(DcMotor.Direction.REVERSE);
        motorRightFront.setDirection(DcMotor.Direction.REVERSE);

        captain = new ArcadeDriver4(motorLeftBack, motorRightBack, motorLeftFront, motorRightFront, gamepad1);


	}


	@Override
	public void loop() {

        /*

        double gamepadX = gamepad1.left_stick_x;
        double gamepadY = -gamepad1.left_stick_y;

        double leftPower = gamepadY + gamepadX;
        double rightPower = gamepadY - gamepadX;

        leftPower = Range.clip(leftPower, -1, 1);
        rightPower = Range.clip(rightPower,-1,1);

        motorLeft.setPower(leftPower);
        motorRight.setPower(rightPower);

        */

        //Condensed Version
        motorLeftBack.setPower(Range.clip(-gamepad1.left_stick_y + gamepad1.left_stick_x,-1,1));
        motorLeftFront.setPower(Range.clip(-gamepad1.left_stick_y + gamepad1.left_stick_x,-1,1));


        motorRightFront.setPower(Range.clip(-gamepad1.left_stick_y - gamepad1.left_stick_x,-1,1));
        motorRightBack.setPower(Range.clip(-gamepad1.left_stick_y - gamepad1.left_stick_x,-1,1));


        //captain.userControl();



    }

	@Override
	public void stop() {

	}





}
