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
	float azimut;
	float pitch;
	float roll;
	public SensorPlayground() {

	}


	@Override
	public void init() {




	}


	@Override
	public void loop() {


		telemetry.addData("text", "Azimut: " + azimut);
		telemetry.addData("text", "Pitch: " + pitch);
		telemetry.addData("text", "Roll: " + roll);


    }

	@Override
	public void stop() {

	}

    @Override
	public void onSensorChanged(SensorEvent event) {
		if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER)
			mGravity = event.values;
		if (event.sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD)
			mGeomagnetic = event.values;
		if (mGravity != null && mGeomagnetic != null) {
			float R[] = new float[9];
			float I[] = new float[9];
			boolean success = SensorManager.getRotationMatrix(R, I, mGravity, mGeomagnetic);
			if (success) {
				float orientation[] = new float[3];
				SensorManager.getOrientation(R, orientation);
				azimut = orientation[0]; // orientation contains: azimut, pitch and roll
				pitch = orientation[1];
				roll = orientation[2];

			}
		}
	}


	public void onAccuracyChanged(Sensor sensor, int accuracy)
	{

	}

}
