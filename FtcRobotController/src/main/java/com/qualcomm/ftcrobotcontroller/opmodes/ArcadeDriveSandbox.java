package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.ftcrobotcontroller.lib.ArcadeDriver4;
import com.qualcomm.ftcrobotcontroller.lib.ArcadeDriver6;
import com.qualcomm.ftcrobotcontroller.lib.DriveGen;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Arcade Drive
 *
 *
 */
public class ArcadeDriveSandbox extends OpMode {

    ArcadeDriver4 captain;
    DriveGen launch;

    DcMotor motorLeftBack;
    DcMotor motorRightBack;
    DcMotor motorLeftFront;
    DcMotor motorRightFront;
    DcMotor motorLeftMid;
    DcMotor motorRightMid;

    DcMotor motorLauncher;


	public ArcadeDriveSandbox() {

	}


	@Override
	public void init() {

        motorLeftBack = hardwareMap.dcMotor.get("motorLeftBack");
        motorRightBack = hardwareMap.dcMotor.get("motorRightBack");
        motorLeftFront = hardwareMap.dcMotor.get("motorLeftFront");
        motorRightFront = hardwareMap.dcMotor.get("motorRightFront");
        //motorLeftMid = hardwareMap.dcMotor.get("motorLeftMid");
        //motorRightMid = hardwareMap.dcMotor.get("motorRightMid");

        motorRightBack.setDirection(DcMotor.Direction.REVERSE);
        motorRightFront.setDirection(DcMotor.Direction.REVERSE);
        //motorRightMid.setDirection(DcMotor.Direction.REVERSE);

        captain = new ArcadeDriver4(motorLeftBack, motorRightBack, motorLeftFront, motorRightFront, gamepad1);

	    //motorLauncher = hardwareMap.dcMotor.get("launcher");
	
	    //launch = new DriveGen();
	

	}


	@Override
	public void loop() {

        captain.userControl();
        //if (gamepad1.a) launch.run(motorLauncher);
        //else launch.stop(motorLauncher);

    }

	@Override
	public void stop() {

	}

    	


}
