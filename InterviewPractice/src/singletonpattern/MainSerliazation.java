package singletonpattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import interview.Emp;

public class MainSerliazation {
	public static void main(String args[]) throws Exception {
		SingletonSerialization singleton1 = SingletonSerialization.getInstance();

		// serialize

		// create a file
		File f = new File("F:\\Study\\SpringBoot\\testsingleton.ser");

		try {
			if (!f.exists()) {
				f.createNewFile();
			}

			// serialization started - object to byte stream
			FileOutputStream fileOutputStream = new FileOutputStream(f);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			// serialize object
			objectOutputStream.writeObject(singleton1);
			System.out.println("Object has been serialized");

		}

		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		// de-serialize
		SingletonSerialization singleton2;
		try {
			FileInputStream fileInputStream = new FileInputStream(f);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			singleton2 = (SingletonSerialization) objectInputStream.readObject();
			System.out.println(singleton2);
			System.out.println("Object has been de-serialized");
			System.out.println(singleton1 == singleton2); // false
		}
		
		catch (Exception ex) {
			ex.printStackTrace();
		}


		
		
	}
}
