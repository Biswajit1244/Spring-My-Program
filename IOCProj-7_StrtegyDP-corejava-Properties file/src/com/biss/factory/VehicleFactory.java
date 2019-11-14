package com.biss.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.biss.comp.Engine;
import com.biss.comp.Vehicle;

public class VehicleFactory {
	
	public static Vehicle getInstance()throws Exception{
		Engine engine=null;
		Vehicle vh=null;
		Properties prop=null;
		//create engine obj

		InputStream is=new FileInputStream("src/com/biss/prop/add.properties");
		prop=new Properties();
		prop.load(is);
		
		vh=new Vehicle();
		Class c=Class.forName(prop.getProperty("dependent"));
		engine=(Engine)c.newInstance();
		vh.setEngine(engine);
		
		return vh;
	}
}