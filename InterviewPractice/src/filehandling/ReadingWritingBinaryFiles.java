package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingWritingBinaryFiles {
	public static void main(String args[]) {
		 
		// input file
		File file1 = new File("F:\\Study\\SpringBoot\\inputBinary.txt");
		
		// output file
		File file2 = new File("F:\\Study\\SpringBoot\\outputBinary.txt");
		
		 
		try {
			// read binary file
			FileInputStream fileInputStream = new FileInputStream(file1);
			int temp = fileInputStream.read();
			fileInputStream.close();
			
			// write binary file
			FileOutputStream fileOutputStream = new FileOutputStream(file2);
			fileOutputStream.write(temp);
			fileOutputStream.close();
		}
		catch (IOException ex) {
			 ex.printStackTrace();
		}
		
		
		
		
		
	}
}
