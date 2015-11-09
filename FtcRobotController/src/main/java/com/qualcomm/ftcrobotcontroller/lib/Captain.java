package com.qualcomm.ftcrobotcontroller.lib;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.Gamepad;

public class Captain {

    private DcMotor[] motors;
    private Gamepad[] gamepads;

    private int oindex;

    public Captain(int size) {

        motors = new DcMotor[size];
        oindex = 0;
        initializeGamepads();

    }

    public Captain(DcMotor[] motors)
    {
        this.motors = motors;
        oindex = -1;
        initializeGamepads();
    }

    public Captain(DcMotor motor)
    {
        motors = new DcMotor[1];
        motors[0] = motor;
        oindex = -1;
        initializeGamepads();
    }

    public void initializeGamepads()
    {
        gamepads = new Gamepad[2];
    }

    public void addMotor(DcMotor motor)
    {
        motors[oindex] = motor;
        oindex++;
    }

    public void setMotor(DcMotor motor, int index)
    {
        motors[index] = motor;
    }

    public void removeMotor()
    {
        motors[oindex-1] = null;
        oindex--;
    }

    public void removeMotor(int index)
    {
        motors[index] = null;
    }

    public void enableEncoder(int index)
    {
        motors[index].setChannelMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
    }

    public void disableEncoder(int index)
    {
        motors[index].setChannelMode(DcMotorController.RunMode.RUN_WITHOUT_ENCODERS);
    }

    public int getLatestIndex()
    {
        return oindex;
    }

    public void addGamepad(Gamepad gamepad, int index)
    {
        gamepads[index] = gamepad;
    }

    public void run(int index)
    {
        run(index, 1);
    }

    public void run(int index, double power)
    {
        motors[index].setPower(power);
    }





}
