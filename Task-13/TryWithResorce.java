package Task13;

import java.io.FileInputStream;

public class TryWithResorce {

	public static void main(String[] args) {
		try(FileInputStream file=new FileInputStream("C:\\Users\\SSLTP11352\\eclipse-workspace\\Basics\\src\\Task13\\TryWithResorce.java")){
			String msg = "Welcome to javaTpoint!";      
			byte byteArray[] = msg.getBytes(); 
			System.out.println("Message written to file successfuly!");      
		}catch(Exception exception){  
		       System.out.println(exception);  
		}
		   
			

	}

}

