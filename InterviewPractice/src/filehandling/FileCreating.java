package filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreating {

	public static void main(String args[]) {
		
		
		// creating a file
		
		try {
			
		
		File file = new File("F:\\Study\\SpringBoot\\testFile.txt");
		
		if(file.createNewFile()) {
			System.out.println("Creating file.......");
			System.out.println("File Created "+file.getName());
		}
		else {
			System.out.println("File Already Exists!");
		}
		System.out.println("File exist? "+file.exists());
		System.out.println("isFile ? "+file.isFile());
		System.out.println("can write "+file.canWrite());
		System.out.println("can read "+file.canRead());
		System.out.println("isDirectory ? "+file.isDirectory());
		System.out.println("Length ? "+file.length());
		System.out.println("isHidden ? "+file.isHidden());
		}
		catch(IOException ex) {
			System.out.println("Some problem occured!");
			ex.printStackTrace();
		}
		
	}
	
}
