package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String args[]) {
		
		
		// reading a file
		try {

			File file = new File("F:\\Study\\SpringBoot\\test.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			// System.out.print(fr.read());
			String str;
            while ((str = br.readLine()) != null) {  // read once inside condition
                System.out.print(str+"\n"); // print without skipping
            }
			fr.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
	
}
