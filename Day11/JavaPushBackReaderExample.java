package IO_Classes;
import java.io.File;
import java.io.PushbackReader;
import java.io.FileReader;
import java.io.IOException;
public class JavaPushBackReaderExample{ 
	public static void main(String args[])     { 
		FileReader fr = null; 
		PushbackReader pr = null;
		try          {    
			fr = new FileReader("D:"+File.separator+"out.txt");
			pr = new PushbackReader(fr);
			int d;     
			while((d = pr.read()) != -1)
			{                  System.out.print((char)d);
					pr.skip(1);
							
			}        
			}        
		catch(IOException ioe) { 
				System.out.println(ioe); }    
			finally{    
				if(fr != null){ 
					try{  
						fr.close();}
					catch(Exception e){
						System.out.println(e);}
					}   
				if(pr != null){
					try{
						pr.close();
						}
					catch(Exception e){
						System.out.println(e);}
					}
				}
			}
	}