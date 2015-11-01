package com.qualcomm.ftcrobotcontroller.lib;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.util.Range;

public class ArcadeDriver6 {


    DcMotor motorLeftBack;
    DcMotor motorRightBack;
    DcMotor motorLeftFront;
    DcMotor motorRightFront;
    DcMotor motorLeftMid;
    DcMotor motorRightMid;

    Gamepad gamepad;


    public ArcadeDriver6(DcMotor motorLeftBack,
                         DcMotor motorRightBack,
                         DcMotor motorLeftFront,
                         DcMotor motorRightFront,
                         DcMotor motorLeftMid,
                         DcMotor motorRightMid, Gamepad gamepad) {

        this.motorLeftBack = motorLeftBack;
        this.motorRightBack = motorRightBack;
        this.motorLeftFront = motorLeftFront;
        this.motorRightFront = motorRightFront;
        this.motorLeftMid = motorLeftMid;
        this.motorRightMid = motorRightMid;

        this.gamepad = gamepad;

    }

    public void userControl() {

        motorLeftBack.setPower(Range.clip(-gamepad.left_stick_y + gamepad.left_stick_x, -1, 1));
        motorLeftFront.setPower(Range.clip(-gamepad.left_stick_y + gamepad.left_stick_x, -1, 1));
        motorLeftMid.setPower(Range.clip(-gamepad.left_stick_y + gamepad.left_stick_x, -1, 1));


        motorRightFront.setPower(Range.clip(-gamepad.left_stick_y - gamepad.left_stick_x, -1, 1));
        motorRightBack.setPower(Range.clip(-gamepad.left_stick_y - gamepad.left_stick_x, -1, 1));
        motorRightMid.setPower(Range.clip(-gamepad.left_stick_y - gamepad.left_stick_x, -1, 1));


    }


}
