package consoleBankApp;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Operations extends Register {
		int ch;
		
		boolean performOperations(int ch) {
			Account account = new Account();
			Scanner input = new Scanner(System.in);
			switch (ch) {
			case 1:
				System.out.print("Enter Amount : ");
				double amt = input.nextDouble();
				account.depostAmt(amt);
				return true;
//				break;
			case 2:
				System.out.print("Enter Payee username : ");
				String payeeName = input.next();
				System.out.print("Enter Amount : ");
				double transferAmt = input.nextDouble();
				if(findUser(payeeName, transferAmt)) 
					account.withdraw(transferAmt);
				break;
			case 3:
				User userDeposit = Login.loginnedUser;
				System.out.println("Intial Deposit : "+ userDeposit.InitialDep);
				System.out.println("Balance : "+userDeposit.balance);
				break;
			case 4:
				User userInfo = Login.loginnedUser;
				System.out.println("Accountholder Name : "+ userInfo.name);
				System.out.println("Accountholder Address : "+ userInfo.address);
				System.out.println("Accountholder Contact : "+ userInfo.contact);
				return true;
			case 5:
				return false;
			default:
				break;
			}
			return true;
		}
		
		boolean findUser(String username,Double amt) {
//			boolean userFound = false;
//			HashMap<User, Integer> user = new HashMap<>();
//			user = Operations.users;
//		    for(User u : user.keySet() ) {
////		    	System.out.println(u);
////		    	System.out.println("User : "+u.username+"  Password : "+u.password);
//		        if(username.equals(u.username)) {
//		        	userFound = true;
//		        	u.balance += amt;
//		        	if(userFound) {
//			        	System.out.println("Transaction successfull"); 
//			        }
//			        else {
//			        	System.out.println("Username doesn't exist."); 
//					} 
//		        	return userFound;
//		        }
//		    }
//		    return userFound;
			boolean userFound = false;
			ObjectInputStream ois = null;
			MyObjectOutputStream oos = null;
			String inputFile = "resources/users.db";
			 try {
				 ois = new ObjectInputStream(new FileInputStream(inputFile));
				 oos = new MyObjectOutputStream(new FileOutputStream(inputFile));
				 while(true) {
					 User user = (User) ois.readObject();
					 //System.out.println(user.toString());
				        if(username.equals(user.getUsername())) {
				        	user.balance += amt;
							user.setBalance(user.balance); 
//				        	oos.writeDouble(user.balance);
				        	oos.reset();
				        	oos.writeObject(user);
				        	userFound = true;
				        	System.out.println("Updated balance : "+user.getBalance());
				        	break;
				        }
				 }
			        if(userFound) 
			        	System.out.println("Transaction successfull");
			        else
			        	System.out.println("Username doesn't exist.");
			        return userFound;
			 }
			 catch(EOFException e) {
				 return userFound;
			 }
			 catch(Exception e) {
				 e.printStackTrace();
				 return userFound;
			 }
		}
}

