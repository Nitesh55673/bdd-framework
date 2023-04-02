package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	private Properties pro;
	private FileInputStream file;
	private String filePath;
	private String value;

	public PropertiesReader() {
		pro = new Properties();
		filePath = "resources/application.properties";

	}

	public String getData(String Key) {
		try {
			file = new FileInputStream(filePath);
			pro.load(file);
			value = pro.getProperty(Key);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
			
				
		return value;
		
		
	}
	public static void main(String  [] args) {
		PropertiesReader pro = new PropertiesReader();
		System.out.println(pro.getData("url"));
	}
	
	

}
