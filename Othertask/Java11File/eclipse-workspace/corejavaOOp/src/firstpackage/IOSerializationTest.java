package firstpackage;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class IOSerializationTest {
	public static void main(String[] args) {
		List<Trainer> trainers = new ArrayList<Trainer>(); //Adds specific type of elements : Trainer
//		List trainers = new ArrayList(); // Alllows to enter any type of objects
		
		ObjectOutputStream oos = null;
		String outputFile = "resources/trainers.db";
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(outputFile));
			trainers.add(new Trainer("John",dateFormat.parse("02-12-2020"), true, 30, 8000.5f));
			trainers.add(new Trainer("Hannah",dateFormat.parse("05-08-2018"), true, 30, 8000.5f));
			trainers.add(new Trainer("Peter",dateFormat.parse("27-04-2019"), true, 30, 8000.5f));
			for(Trainer trainer:trainers) {
				oos.writeObject(trainer);
				System.out.println("Serialization Done!");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(oos!=null)
				try {
					oos.close();
				}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
