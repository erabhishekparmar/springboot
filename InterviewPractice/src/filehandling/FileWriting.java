package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileWriting {

	public static void main(String args[]) {
		
		
		// reading a file
		
		try {
		 
		File file = new File("F:\\Study\\SpringBoot\\test.txt");
		FileReader fr = new FileReader(file);
		//System.out.print(fr.read());
		int i = fr.read();
		while( i!=-1) {
			System.out.println((char)i);
		}
			 
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
}
