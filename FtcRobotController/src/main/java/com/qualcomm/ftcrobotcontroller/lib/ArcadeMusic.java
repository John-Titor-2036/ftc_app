package com.qualcomm.ftcrobotcontroller.lib;


import android.content.Context;
import android.media.MediaPlayer;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.util.Range;

public class ArcadeMusic {


    DcMotor motorLeftBack;
    DcMotor motorRightBack;
    DcMotor motorLeftFront;
    DcMotor motorRightFront;
    DcMotor motorLeftMid;
    DcMotor motorRightMid;

    Gamepad gamepad;

    boolean musicPlaying;

    AudioPlayer ap;



    public ArcadeMusic(DcMotor motorLeftBack,
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

        //if (gamepad.left_stick_y != 0 && gamepad.left_stick_x != 0 && !musicPlaying)
        //else musicPlaying = true;

        motorLeftBack.setPower(Range.clip(-gamepad.left_stick_y + gamepad.left_stick_x, -1, 1));
        motorLeftFront.setPower(Range.clip(-gamepad.left_stick_y + gamepad.left_stick_x, -1, 1));
        motorLeftMid.setPower(Range.clip(-gamepad.left_stick_y + gamepad.left_stick_x, -1, 1));


        motorRightFront.setPower(Range.clip(-gamepad.left_stick_y - gamepad.left_stick_x, -1, 1));
        motorRightBack.setPower(Range.clip(-gamepad.left_stick_y - gamepad.left_stick_x, -1, 1));
        motorRightMid.setPower(Range.clip(-gamepad.left_stick_y - gamepad.left_stick_x, -1, 1));




    }




}
