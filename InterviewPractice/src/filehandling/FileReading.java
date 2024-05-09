package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReading {

	public static void main(String args[]) {
		
		
		// reading a file
		
		try {
		 
		File file = new File("F:\\Study\\SpringBoot\\test.txt");
		FileWriter fr = new FileWriter(file);
		fr.write(123);
		System.out.println("Written data 123");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
}
