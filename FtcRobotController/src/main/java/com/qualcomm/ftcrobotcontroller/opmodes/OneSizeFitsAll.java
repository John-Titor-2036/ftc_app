package com.qualcomm.ftcrobotcontroller.opmodes;

import android.util.Xml;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.robocol.Telemetry;

import org.xmlpull.v1.XmlPullParser;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

/**
 Marshmallow and @DatSwoosh
 */

public class OneSizeFitsAll extends OpMode {

	enum configType {
		TWOM,
		FOURM,
		SIXM;
		// AMT. OF MOTORS
	}

	public OneSizeFitsAll() {

	}


	@Override
	public void init() {

		File file = new File("/storage/emulated/0/FIRST/osfa.xml");

		InputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(file));

			XmlPullParser parse = Xml.newPullParser();
			parse.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
			parse.setInput(in, null);
			while (parse.next() != XmlPullParser.END_TAG) {
				telemetry.addData("Value: ", parse.getName());
			}

				if (in != null) {

					in.close();
				}

		}

		catch (Exception e) {
			telemetry.addData("Error: ", e);
		}

	}


	@Override
	public void loop() {



	}

	@Override
	public void stop() {

	}

    	


}
