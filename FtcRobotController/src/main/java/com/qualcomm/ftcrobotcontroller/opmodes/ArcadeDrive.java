package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

/**
 * Arcade Drive
 *
 *
 */
public class ArcadeDrive extends OpMode {


	DcMotor motorLeft;
    DcMotor motorRight;

	public ArcadeDrive() {

	}


	@Override
	public void init() {

        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);



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
        motorLeft.setPower(Range.clip(-gamepad1.left_stick_y + gamepad1.left_stick_x,-1,1));
        motorRight.setPower(Range.clip(-gamepad1.left_stick_y - gamepad1.left_stick_x,-1,1));


	}

	@Override
	public void stop() {

	}

    	


}
