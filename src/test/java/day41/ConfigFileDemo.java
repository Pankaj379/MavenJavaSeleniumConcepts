package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ConfigFileDemo {
	
public static void main (String args[]) throws IOException {
	
	// Step1: Give location of property file.
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.property");
	
	
	// Step2: Load Property File:
	Properties proFile = new Properties();
	proFile.load(file);
	
	//Step3: Read data from Property file:
	
	String key = proFile.getProperty("Key");
	String url = proFile.getProperty("URL");
	String email = proFile.getProperty("Email");
	String pass = proFile.getProperty("Password");
	String oid = proFile.getProperty("Orderid");
	String cid = proFile.getProperty("Customerid");
	
	System.out.println(key +"  "+url+" "+email+"  "+pass+"  "+oid+"  "+cid);
	
	// If only reading Keys:
	
	// Method 1:
	Set<String> keys = proFile.stringPropertyNames();
	System.out.println(keys);
	
	// Method 2:
	Set<Object> keyss = proFile.keySet();
	System.out.println(keyss);
	
	// Similarly read all values:
	Collection<Object> values = proFile.values();
	System.out.println(values);
	
	file.close();
}

}
