package com.qualcomm.ftcrobotcontroller.lib;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.util.Range;

public class ArcadeDriver4 {


    DcMotor motorLeftBack;
    DcMotor motorRightBack;
    DcMotor motorLeftFront;
    DcMotor motorRightFront;

    Gamepad gamepad;


    public ArcadeDriver4(DcMotor motorLeftBack,
                         DcMotor motorRightBack,
                         DcMotor motorLeftFront,
                         DcMotor motorRightFront,
                         Gamepad gamepad) {

        this.motorLeftBack = motorLeftBack;
        this.motorRightBack = motorRightBack;
        this.motorLeftFront = motorLeftFront;
        this.motorRightFront = motorRightFront;

        this.gamepad = gamepad;

    }

    public void userControl() {

        motorLeftBack.setPower(Range.clip(-gamepad.left_stick_y + gamepad.left_stick_x, -1, 1));
        motorLeftFront.setPower(Range.clip(-gamepad.left_stick_y + gamepad.left_stick_x, -1, 1));


        motorRightFront.setPower(Range.clip(-gamepad.left_stick_y - gamepad.left_stick_x, -1, 1));
        motorRightBack.setPower(Range.clip(-gamepad.left_stick_y - gamepad.left_stick_x, -1, 1));


    }


}
