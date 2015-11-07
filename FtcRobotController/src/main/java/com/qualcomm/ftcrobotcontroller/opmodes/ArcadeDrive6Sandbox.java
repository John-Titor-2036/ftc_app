package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.ftcrobotcontroller.lib.ArcadeDriver6;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

/**
 * Arcade Drive
 *
 *
 */
public class ArcadeDrive6Sandbox extends OpMode {

    ArcadeDriver6 captain;
    GenericDriver launch;

    DcMotor motorLeftBack;
    DcMotor motorRightBack;
    DcMotor motorLeftFront;
    DcMotor motorRightFront;
    DcMotor motorLeftMid;
    DcMotor motorRightMid;


	public ArcadeDrive6Sandbox() {

	}


	@Override
	public void init() {

        motorLeftBack = hardwareMap.dcMotor.get("motorLeftBack");
        motorRightBack = hardwareMap.dcMotor.get("motorRightBack");
        motorLeftFront = hardwareMap.dcMotor.get("motorLeftFront");
        motorRightFront = hardwareMap.dcMotor.get("motorRightFront");
        motorLeftMid = hardwareMap.dcMotor.get("motorLeftMid");
        motorRightMid = hardwareMap.dcMotor.get("motorRightMid");

        motorRightBack.setDirection(DcMotor.Direction.REVERSE);
        motorRightFront.setDirection(DcMotor.Direction.REVERSE);
        motorRightMid.setDirection(DcMotor.Direction.REVERSE);

        captain = new ArcadeDriver6(motorLeftBack, motorRightBack, motorLeftFront, motorRightFront, motorLeftMid, motorRightMid, gamepad1);
	
	
	
	motorLauncher = hardwareMap.dcMotor.get("launcher");
	
	launch = new GenericDriver();
	

	}


	@Override
	public void loop() {

        captain.userControl();
        if (gamepad1.a) launch.run(motorLauncher);
        else launch.stop(motorLauncher);


    }

	@Override
	public void stop() {

	}

    	


}
