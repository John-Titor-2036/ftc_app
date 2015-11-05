package com.qualcomm.ftcrobotcontroller.lib;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

public class GenericDriver {

    boolean encoderEnabled;

    public GenericDriver() {

        encoderEnabled = false;

    }

    public void enableEncoder(DcMotor motor) {

        motor.setChannelMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        encoderEnabled = true;

    }


    public void run(DcMotor motor) {

        motor.setPower(1);

    }

    public void run(DcMotor motor, double power) {

        motor.setPower(power);

    }

    public void run(DcMotor Motor, double power, double metres) {



    }


    public void stop(DcMotor motor) {

        motor.setPower(0);

    }

    /* TODO
    Run for X metres
    Run for X metres at X speed


     */

}
