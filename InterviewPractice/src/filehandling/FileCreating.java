package filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreating {

	public static void main(String args[]) {
		
		
		// creating a file
		
		try {
			
		
		File file = new File("F:\\Study\\SpringBoot\\test.txt");
		System.out.println("Creating file.......");
		if(file.createNewFile()) {
			System.out.println("File Created");
		}
		else {
			System.out.println("File Already Exists!");
		}
		
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
}
