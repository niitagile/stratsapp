package IO_Classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;
 
public class properties_reading {
  public static void main(String[] args) {
 
	Properties prop = new Properties();
	InputStream input = null;
 
	try {
 
		input = new FileInputStream("db1.properties");
 
		// load a properties file
		prop.load(input);
 /*String dt=prop.getProperty("database");
 String user=prop.getProperty("dbuser");
 String pwd=prop.getProperty("dbpassword");
 Connection con=DriverManager.getConnection(dt,user,pwd);*/
		// get the property value and print it out
		System.out.println(prop.getProperty("database"));
		System.out.println(prop.getProperty("dbuser"));
		System.out.println(prop.getProperty("dbpassword"));
 
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
 
  }
}