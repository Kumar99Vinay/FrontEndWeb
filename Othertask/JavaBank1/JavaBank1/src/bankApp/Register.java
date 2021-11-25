package bankApp;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStreamReader;

import java.io.ObjectOutputStream;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import consolebasedApplication.BankExceptions;

public class Register {

	String name;
	String address;
	String contact;
	protected String username;
	protected String password;
	String InitialDep;
	// ArrayList<User> user ;
	// static HashMap<User, Integer> users = new HashMap<>();
	private static File f = new File("resources/users.db");

	public boolean Registeration() throws IOException {
//		Scanner input = new Scanner(System.in);
		BufferedReader brInp = new BufferedReader(new InputStreamReader(System.in));
//		
		List<User> users = new ArrayList<User>();
//		

//		
//		
		System.out.print("Enter Name : ");
		name = brInp.readLine();

		System.out.print("Enter address : ");
		address = brInp.readLine();

		System.out.print("Enter Contact number : ");
		contact = brInp.readLine();

		System.out.print("Set Username : ");
		username = brInp.readLine();

		System.out.print("Set a  (minimum 8 chars; minimum 1 digit, 1 lowercase, 1 \r\n"
				+ "uppercase, 1 special character[!@#$%^&*_]) : ");
//		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*_]])(?=\\\\\\\\S+$).{8,12}$";
		password = brInp.readLine();
		boolean verify = passwordValidation(password);
		while (verify != true) {
			System.out.print("Set Again : ");
			password = brInp.readLine();
			verify = passwordValidation(password);
		}

		System.out.print("Enter Initial Deposit : ");
		InitialDep = brInp.readLine();

		// way1 to store user data using hashmap
//			List<User> users = new ArrayList<User>();
//		 User newUser1= new User("Jay1", "Diu", "9090909090", "jaykumar1", "J@ykumar99", "900000",90000);
//		 User newUser2= new User("Jay2", "Diu", "9090909090", "jaykumar2", "J@ykumar99", "900000",90000);
//		 newUser.balance = Integer.parseInt(InitialDep);
//		 System.out.println(User.countUsers);
//		 users.put(newUser1, User.countUsers);
//		 users.put(newUser2, User.countUsers);
//		 for(User u:users.keySet()) {
//			 System.out.println(u.toString());
//		 }
//		 System.out.println(users);

		// Way 2: using serializaton
		String outputFile = "resources/users.db";
		try {
			if (f.length() == 0) {
				ObjectOutputStream oos = null;
				oos = new ObjectOutputStream(new FileOutputStream(outputFile, true));
//                 users.add(new User("Jay1", "Diu", "9090909090", "jaykumar1", "J@ykumar99", "90000",90000));
				users.add(
						new User(name, address, contact, username, password, InitialDep, Integer.parseInt(InitialDep)));
				for (User user : users)
					oos.writeObject(user);
				oos.close();
			} else {
				MyObjectOutputStream oos = null;
				oos = new MyObjectOutputStream(new FileOutputStream(outputFile, true));
//                 users.add(new User("Jay2", "Diu", "9090909090", "jaykumar2", "J@ykumar99", "90000",90000));
				users.add(
						new User(name, address, contact, username, password, InitialDep, Integer.parseInt(InitialDep)));
				for (User user : users) {
					System.out.println(user.toString());
					oos.writeObject(user);
				}
				oos.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
//			finally {
//				if(oos != null) {
//					try {
//						oos.close();
//					}catch(IOException e) {
//						e.printStackTrace();
//						return false;
//					}
//				}
//				return true;
//			}
		return true;
	}

	boolean passwordValidation(String password) {
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[!@#$%^&*_])" + "(?=\\S+$).{8,20}$";
//		String digits ="^(?=.*[0-9])";
//		String alphabets = "(?=.*[a-z])(?=.*[A-Z])";
//		String specialChars = "(?=.*[!@#$%^&*_])";
//		String WhiteSpace = "(?=\\S+$).{8,20}$";
//		String regex = digits+ alphabets+ specialChars+ WhiteSpace ;
		Pattern p = Pattern.compile(regex);
		try {

			if (password == "") {
				throw new BankExceptions("Must Enter Password");
			} else {
				Matcher matcher = p.matcher(password);
//				System.out.println(matcher.matches());
				if (!matcher.matches()) {
					throw new BankExceptions("Invalid Password Condition");
				}
			}
		} catch (BankExceptions e) {
			System.out.println(e);
			return false;
		}
		return true;
	}
}
