package consoleBankApp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import consoleBankApp.Register;

public class App {

	static void displayHeader(String name) {
		System.out.println("----------------------");
		System.out.println(name);
		System.out.println("----------------------");
	}
	
	public static void main(String[] args) throws IOException {
		
		MyBank bank = new MyBank("SC Bank");
		App.displayHeader(bank.bankName);
		
		Scanner input = new Scanner(System.in);
		Register reg = new Register();
		Login login = new Login();
		Operations ops = new Operations();
		BufferedReader brInp = new BufferedReader(new InputStreamReader(System.in));
		int choice=0 ;
//		bank.displayChoice();
		
		while(choice != 4) {
			bank.displayChoice();
			System.out.print("Enter your choice : ");
			choice = input.nextInt();
			switch (choice) {
			case 1:
					if(reg.Registeration()) {
							
						App.displayHeader("Registered Successfully");
						
					}
				break;
			case 2:
				
				System.out.print("Enter username : ");
				String username = brInp.readLine();
				
				System.out.print("Enter Password : ");
				String password = brInp.readLine();
				boolean auth = login.checkUserLogin(username,password);
				if(auth) {
					App.displayHeader("W E L C O M E");
					login.displayLoginedChoice();
					System.out.print("Enter your choice : ");
					ops.ch = input.nextInt();
					boolean notLogOut = ops.performOperations(ops.ch);
					while(notLogOut != false) {
						login.displayLoginedChoice();
						System.out.print("Enter your choice : ");
						ops.ch = input.nextInt();
						notLogOut = ops.performOperations(ops.ch);
					};
				}else {
					System.out.println("Invalid Credentials");
					App.displayHeader("Login Again");
				}
				
				break;
			case 3:
				Update update = new Update();
//				update.Registeration();
				break;
			case 4:
				App.displayHeader("THANK YOU");
				break;
			default:
				break;
			}
		}
		
		
		

	}
	
}
