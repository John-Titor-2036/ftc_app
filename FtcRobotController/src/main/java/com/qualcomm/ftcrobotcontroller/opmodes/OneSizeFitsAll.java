/*
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

*/
/**
 Marshmallow and @DatSwoosh
 *//*


public class OneSizeFitsAll extends OpMode {

	enum configType {
		TWOM,
		FOURM,
		SIXM;
		// AMT. OF MOTORS
	}

	public configType CONFIG;

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
				int motorCount = 0;
				while (parse.next() != XmlPullParser.END_TAG) {
					if (parse.getName().equals("Motor")) motorCount++;
				}
				telemetry.addData("# of motors: ", motorCount);

				switch (motorCount) {
					case (2): CONFIG = configType.TWOM;
						break;
					case (4): CONFIG = configType.FOURM;
						break;
					case (6): CONFIG = configType.SIXM;
						break;
				}

				if (in != null) {

					in.close();
				}

			}

			catch (Exception e) {
				telemetry.addData("Error: ", e);
			}

			if (CONFIG == configType.FOURM) {
				ArcadeDrive ad = new ArcadeDrive();
				ad.init();
				ad.loop();
				ad.stop();
			}

			else if (CONFIG == configType.SIXM) {
				TankDrive6WD td = new TankDrive6WD();
				td.init();
			td.loop();
			td.stop();
		}
	}


	@Override
	public void loop() {



	}

	@Override
	public void stop() {

	}




}
*/
