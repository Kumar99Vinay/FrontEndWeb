package com.neosoft;

public class UserDefinedException {

	public static void main(String[] args) {
		
		Account acct = new Account();
		System.out.println("Current balance : " + acct.balance());
		System.out.println("Withdrawing $200"); acct.withdraw(30000);
		System.out.println("Current balance : " + acct.balance());
		acct.withdraw(1000);

		
		

	}

}

 class Account{
	 private int balance=20000;
	 public int balance() {
		 return balance;
	 }
	 
	 
	 public void withdraw(int amount) throws NotSufficientFundException {
		 if (amount > balance) {
			 throw new NotSufficientFundException( String.format("Current balance %d is less than requested amount %d", balance, amount));
			 } 
		 balance = balance - amount;
		 }

	
	
}
 
  class NotSufficientFundException extends RuntimeException { 
	 private String message; 
	 public NotSufficientFundException(String message) { 
		 this.message = message; 
		 } 
	 
	 public NotSufficientFundException(Throwable cause, String message) { 
		 super(cause); 
		 this.message = message; 
		 } 
	 public String getMessage() {
		 return message;
		 } 
	 }

 
