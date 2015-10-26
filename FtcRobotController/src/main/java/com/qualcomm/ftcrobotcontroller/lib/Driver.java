package com.qualcomm.ftcrobotcontroller.lib;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Driver {

    DcMotor motorLeftBack;
    DcMotor motorRightBack;
    DcMotor motorLeftFront;
    DcMotor motorRightFront;
    DcMotor motorLeftMid;
    DcMotor motorRightMid;

    DcMotor motorIntake;


    public Driver(DcMotor motorLeftBack, DcMotor motorRightBack, DcMotor motorLeftFront,
                  DcMotor motorRightFront, DcMotor motorLeftMid, DcMotor motorRightMid) {
        this.motorLeftBack = motorLeftBack;
        this.motorRightBack = motorRightBack;
        this.motorLeftFront = motorLeftFront;
        this.motorRightFront = motorRightFront;
        this.motorLeftMid = motorLeftMid;
        this.motorRightMid = motorRightMid;

    }

    public Driver(DcMotor motorIntake)
    {
        this.motorIntake = motorIntake;
    }

    public void test() {
        motorLeftBack.setPower(1);
        motorLeftFront.setPower(1);
        motorLeftMid.setPower(1);

        motorRightBack.setPower(1);
        motorRightFront.setPower(1);
        motorRightMid.setPower(1);
    }

    public void runIntake() {
        motorIntake.setPower(1);
    }

}
