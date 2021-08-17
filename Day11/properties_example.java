package IO_Classes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
 
public class properties_example {
  public static void main(String[] args) {
 
	Properties prop = new Properties();
	OutputStream output = null;
 
	try {
 
		output = new FileOutputStream("db1.properties");
 
		// set the properties value
		prop.setProperty("database", "localhost");
		prop.setProperty("dbuser", "nidhi");
		prop.setProperty("dbpassword", "12345");
 
		// save properties to project root folder
		prop.store(output, null);
 
	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
 
	}
  }
}