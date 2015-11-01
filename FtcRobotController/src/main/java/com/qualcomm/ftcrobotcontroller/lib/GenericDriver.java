package com.qualcomm.ftcrobotcontroller.lib;


import com.qualcomm.robotcore.hardware.DcMotor;

public class GenericDriver {


    DcMotor[] motors;

    public GenericDriver() {


    }

    public DcMotor getMotor(int index) {

        return motors[index - 1];
    }

    public void run(DcMotor motor) {

        motor.setPower(1);

    }

    public void run(DcMotor motor, double power) {

        motor.setPower(power);

    }

    public void stop(DcMotor motor) {
        motor.setPower(0);
    }


}
