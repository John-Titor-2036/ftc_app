package com.qualcomm.ftcrobotcontroller.opmodes;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

import com.qualcomm.ftcrobotcontroller.lib.Driver;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


/**
 * Playground for testing Sensor functions
 *
 *
 */
public class SensorPlayground extends OpMode implements SensorEventListener {


    Driver captain;


    double degree = 0;

	public SensorPlayground() {

	}


	@Override
	public void init() {




	}


	@Override
	public void loop() {





    }

	@Override
	public void stop() {

	}

    @Override
    public void onSensorChanged (SensorEvent event) {

        //degree = Math.round(event.values[0]);
        telemetry.addData("Text", "Degrees: " + event.values[0]);

    }


	public void onAccuracyChanged(Sensor sensor, int accuracy)
	{

	}

}
