package firstpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter u name");
		String name=br.readLine();
		System.out.println("hi "+name);
		br.close();
		
		File file=new File("resources/Sample.txt");
		BufferedReader br2=new BufferedReader(new FileReader(file));
		String line;
		
		while((line = br2.readLine())!=null)
			System.out.println(line);
		
		br2.close();
		
		
		
		BufferedWriter br3=new BufferedWriter(new FileWriter(file,true));
		br3.newLine();
		br3.write("Sample new java text");
		br3.close();
		
		
	
		

	}

}
