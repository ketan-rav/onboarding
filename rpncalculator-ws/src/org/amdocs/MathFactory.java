package org.amdocs;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

public class MathFactory {
	private static HashMap<String,String> classNameMap;
	static {
		classNameMap = new  HashMap<String,String>();
		
		classNameMap.put("+","org.amdocs.Addition");
		classNameMap.put("-","org.amdocs.Subtraction");
		classNameMap.put("*","org.amdocs.Multiplication");
		classNameMap.put("/","org.amdocs.Division");
		
		
		/*FileInputStream file ;
		try{
			 
		file =	new FileInputStream("src/config.properties");
			Properties properties = new Properties();
			properties.load(file);
			properties.forEach((key,value)->{
			classNameMap.put((String)key, (String)value);
			});
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
	}
	
	public static IMathOperation getObject(String mathOperator) {
		IMathOperation mathOperation = null;
		String className;
		className = classNameMap.get(mathOperator);
		try {
			mathOperation =(IMathOperation)Class.forName(className).newInstance();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		
		return mathOperation;
	}
	
}
