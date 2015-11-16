package com.qualcomm.ftcrobotcontroller.lib;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

public class DriveGen {

    boolean encoderEnabled;

    public DriveGen() {

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

    public void run(DcMotor motor, double power, double metres) {

        if (!encoderEnabled) enableEncoder(motor);

        motor.setPower(1);

    }


    public void stop(DcMotor motor) {

        motor.setPower(0);

    }

    /* TODO
    Run for X metres
    Run for X metres at X speed


     */

}
