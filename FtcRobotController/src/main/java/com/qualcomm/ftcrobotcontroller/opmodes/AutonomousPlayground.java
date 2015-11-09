package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.ftcrobotcontroller.lib.DriveGen;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


/**
 * Playground for testing Autonomous functions
 *
 *
 */
public class AutonomousPlayground extends OpMode {

    DcMotor motorLeftBack;
    DcMotor motorRightBack;
    DcMotor motorLeftFront;
    DcMotor motorRightFront;
    DcMotor motorLeftMid;
    DcMotor motorRightMid;

    DcMotor motorIntake;

    //Driver captain;
    DriveGen intake;


	public AutonomousPlayground() {

	}


	@Override
	public void init() {

       /* motorLeftBack = hardwareMap.dcMotor.get("motorLeftBack");
        motorRightBack = hardwareMap.dcMotor.get("motorRightBack");
        motorLeftFront = hardwareMap.dcMotor.get("motorLeftFront");
        motorRightFront = hardwareMap.dcMotor.get("motorRightFront");
        motorLeftMid = hardwareMap.dcMotor.get("motorLeftMid");
        motorRightMid = hardwareMap.dcMotor.get("motorRightMid");

        motorRightBack.setDirection(DcMotor.Direction.REVERSE);
        motorRightFront.setDirection(DcMotor.Direction.REVERSE);
        motorRightMid.setDirection(DcMotor.Direction.REVERSE);*/

        motorIntake = hardwareMap.dcMotor.get("motorIntake");

        //captain = new Driver(motorLeftBack,motorRightBack,motorLeftFront,motorRightFront, motorLeftMid, motorRightMid);

        intake = new DriveGen();

	}


	@Override
	public void loop() {


        intake.run(motorIntake);


    }

	@Override
	public void stop() {

	}

    	


}
