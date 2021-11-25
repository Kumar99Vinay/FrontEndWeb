package consoleBankApp;


import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import consoleBankApp.Register;

public class Login extends Register {
	
	static User loginnedUser;

	
	public boolean checkUserLogin(String username,String password)  {
		
		//Way1 using hashmap
//		boolean logined = false;
//		HashMap<User, Integer> user = new HashMap<>();
//		user = Login.users;
//		System.out.println("User : "+username+"  Password : "+password);
//	    for(User u : user.keySet() ) {
////	    	System.out.println(u);
////	    	System.out.println("User : "+u.username+"  Password : "+u.password);
//	        if(username.equals(u.username) && password.equals(u.password)) {
//	        	logined = true;
//	        	this.loginnedUser = u;
//	        }
//	        if(logined) System.out.println("Login Successfully");
//	        else System.out.println("Invalid Credential");
//			
//	    }
//		return logined; 
		
//		System.out.println(username+"   "+password);
		
		//Way2
		boolean logined = false;
		ObjectInputStream ois = null;
		String inputFile = "resources/users.db";
		 try {
			 ois = new ObjectInputStream(new FileInputStream(inputFile));
			 while(true) {
				 User user = (User) ois.readObject();
				 System.out.println(user.toString());
				  if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
					// System.out.println(user.getUsername() +"  =>   "+ user.getPassword());
					 logined = true;
					 this.loginnedUser = user;
					 break;
				 }
			 }
		        if(logined) System.out.println("Login Successfully");
		        else System.out.println("Invalid Credential");
		        return logined;
		 }
		 catch(EOFException e) {
			 return logined;
		 }
		 catch(Exception e) {
			 e.printStackTrace();
			 return logined;
		 }
		
	}
	
	void displayLoginedChoice() {
		String choicesArr[] = {"Deposit.","Transfer.","Last 5 Transactions.","User Information.","Log out"};
		for (int i = 0; i < choicesArr.length; i++) {
			System.out.println((i+1)+"  "+choicesArr[i]);
		}
	}
//	
//	static User LoginedUser(User u) {
//		return u;
//	}
}
