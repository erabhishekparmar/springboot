package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String args[]) {
		
		
		// writing a file

		try {

			File file = new File("F:\\Study\\SpringBoot\\test.txt");
			FileWriter fr = new FileWriter(file);
			fr.write(123);
			System.out.println("Written data 123");
			fr.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
	
}
