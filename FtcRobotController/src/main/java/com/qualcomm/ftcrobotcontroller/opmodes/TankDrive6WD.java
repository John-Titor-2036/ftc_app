package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


/**
 * 4 Motors Tank Drive
 *
 *
 */
public class TankDrive6WD extends OpMode {

    DcMotor motorLeftBack;
    DcMotor motorRightBack;
    DcMotor motorLeftFront;
    DcMotor motorRightFront;

	public TankDrive6WD() {

	}


	@Override
	public void init() {

        motorLeftBack = hardwareMap.dcMotor.get("motorLeftBack");
        motorRightBack = hardwareMap.dcMotor.get("motorRightBack");
        motorLeftFront = hardwareMap.dcMotor.get("motorLeftFront");
        motorRightFront = hardwareMap.dcMotor.get("motorRightFront");

        motorRightBack.setDirection(DcMotor.Direction.REVERSE);
        motorRightFront.setDirection(DcMotor.Direction.REVERSE);

	}


	@Override
	public void loop() {

       double gamepadY1 = -gamepad1.left_stick_y;
        double gamepadY2 = -gamepad1.right_stick_y;

        motorLeftBack.setPower(gamepadY2);
        motorLeftFront.setPower(gamepadY2);

        motorRightBack.setPower(gamepadY1);
        motorRightFront.setPower(gamepadY1);



    }

	@Override
	public void stop() {

	}

    	


}
