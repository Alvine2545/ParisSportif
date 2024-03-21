package com.yourcompany.alladakan_amoussou.run;

import org.openxava.util.*;

/**
 * Execute this class to start the application.
 *
 * With OpenXava Studio/Eclipse: Right mouse button > Run As > Java Application
 */

public class alladakan_amoussou {

	public static void main(String[] args) throws Exception {
		DBServer.start("alladakan_amoussou-db"); // To use your own database comment this line and configure src/main/webapp/META-INF/context.xml
		AppServer.run("alladakan_amoussou"); // Use AppServer.run("") to run in root context
	}

}
