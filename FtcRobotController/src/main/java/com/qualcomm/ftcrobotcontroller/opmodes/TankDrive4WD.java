package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


/**
 * 4 Motors Tank Drive
 *
 *
 */
public class TankDrive4WD extends OpMode {

    DcMotor motorLeftBack;
    DcMotor motorRightBack;
    DcMotor motorLeftFront;
    DcMotor motorRightFront;

	public TankDrive4WD() {

	}


	@Override
	public void init() {

        motorLeftBack = hardwareMap.dcMotor.get("motorLeftBack");
        motorRightBack = hardwareMap.dcMotor.get("motorRightBack");
        motorLeftFront = hardwareMap.dcMotor.get("motorLeftFront");
        motorRightFront = hardwareMap.dcMotor.get("motorRightFront");

        motorLeftBack.setDirection(DcMotor.Direction.REVERSE);
        motorLeftFront.setDirection(DcMotor.Direction.REVERSE);

	}


	@Override
	public void loop() {

        double gamepadY1 = -gamepad1.left_stick_y;
        double gamepadY2 = -gamepad1.right_stick_y;

        motorLeftBack.setPower(gamepadY1);
        motorLeftFront.setPower(gamepadY1);

        motorRightBack.setPower(gamepadY2);
        motorRightFront.setPower(gamepadY2);

	}

	@Override
	public void stop() {

	}

    	


}
