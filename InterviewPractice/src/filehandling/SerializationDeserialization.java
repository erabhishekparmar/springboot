package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeserialization {
	
	
	public static void main(String[] args) {
		
		Demo demo = new Demo("Abhishek","Parmar", 2 , 2000);
		File file = null;
		try {
			// create file 
			file = new File("F:\\Study\\SpringBoot\\test.ser");
			
			if(file.createNewFile()) {
				System.out.println("File Created Successfully!");
			}
			
			// serialization
			FileOutputStream outputStream = new FileOutputStream(file);
			
			ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream);
			
			objectOutput.writeObject(demo);
			objectOutput.close();
			
			System.out.println("Object has been serialized!!"+demo);
			
			Demo.b=4000;
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		Demo dDemo = null;
		// Starting de-serialization
		try {
		
		FileInputStream inputStream = new FileInputStream(file);
		ObjectInputStream objectInput = new ObjectInputStream(inputStream);

		dDemo = (Demo)objectInput.readObject();
		objectInput.close();
		System.out.println("Object has been Deserialized!"+dDemo);
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

	
	
}
