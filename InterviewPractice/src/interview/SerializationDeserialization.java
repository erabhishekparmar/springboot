package interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeserialization {

	public static void main(String[] args) {
		
		Emp emp = new Emp(1,"Abhishek","Parmar");
		
		// set a and b
		emp.setA(1000);
		emp.b=10;
		
		System.out.println(emp);
		
		// create a file 
		File f = new File("F:\\Study\\SpringBoot\\test.ser");
		
		try {
		if(!f.exists()) {
			f.createNewFile();
		}
		
		 
		// serialization started - object to byte stream 
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		// serialize object
		objectOutputStream.writeObject(emp);
		System.out.println("Object has been serialized");
		
		// change value of b to 20;
		emp.b=20;
		
		}
		
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		// de-serialization started - byte stream to object
		System.out.println("Starting deserialization ........");
		
		
		
		Emp resultEmp;
		
		try {
			FileInputStream fileInputStream = new FileInputStream(f);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			resultEmp = (Emp) objectInputStream.readObject();
			System.out.println(resultEmp);
			System.out.println("Object has been de-serialized");
		}
		
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
