package bankApp;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class User implements Serializable {
	


	private static final long serialVersionUID = 1L;
	
	protected String name;
	protected String address;
	protected String contact;
	protected String username;
	protected String password;
	protected String InitialDep;
	protected double balance;
	long accountNo = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
	HashMap<Double, Integer> transactions = new HashMap<Double, Integer>();
	static int countUsers = 0;
	Date date = new Date(); 
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	String initDepDate;
    //private static NumberFormat formatter = new DecimalFormat("#0.00");
	int transid=1;


	public User(String name, String address, String contact, String username, String password, String initialDep,double balance) {
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.username = username;
		this.password = password;
		this.InitialDep = initialDep;
		this.balance = balance;
//		this.bankAccountNo = System.currentTimeMillis();
		countUsers++;
		this.initDepDate = String.format(dateFormat.format(date));
	}


	public long getAccountNo() {
		return accountNo;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", contact=" + contact + ", username=" + username
				+ ", password=" + password + ", InitialDep=" + InitialDep + ", balance=" + balance + "]";
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getInitialDep() {
		return InitialDep;
	}


	public void setInitialDep(String initialDep) {
		InitialDep = initialDep;
	}


	public static int getCountUsers() {
		return countUsers;
	}


	public static void setCountUsers(int countUsers) {
		User.countUsers = countUsers;
	}


	public double getBalance() {
		return this.balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void addTransaction(double amount,int transno) {
		transactions.put(amount,transno);
	}

	public void displayTransaction(String user) {
//		int count=this.transactions.size();
//		for(String str :this.transactions.values()) {
//			if(count <= count-5) {
//				System.out.println(str);
//			} 
//		 }
//		double temp=0;
		System.out.println(String.format("Intital Deposit - Rs "+this.InitialDep+" as on "+this.initDepDate));
    	try {
//    		for (int i =transid; i>=0; i--) {
//        		temp = temp+transactions.get(i);
//        		if(this.transactions.get(i)>0) {
//        			System.out.println("Rs. " + transactions.get(i) + ", credited to your account ");	
//        		}
//        		else {
//        			System.out.println("Rs. " + transactions.get(i) + ", Debitted from your account ");	
//        		}
//    		}
//    		for ( HashMap.Entry<Double, Integer> entry : transactions.entrySet()) {
//    		    Double key = entry.getKey();
////    		    int value = entry.getValue();
//    		    if(key >0) {
//        			System.out.println("Rs. " + key+ ", credited to your account ");	
//        		}
//        		else {
//        			System.out.println("Rs. " + key + ", Debited from your account ");	
//        		}
//    		    // do something with key and/or tab
//    		}
    		Payments getPayment = new Payments();
    		getPayment.getPayments(user);
    		
    	}catch(NullPointerException e) {
    		System.out.println("No Transaction... Only initial deposit");

    	}
		
	}



	
	
//	User[] addUser( User newUser) {
//	    User[] newUsers = new User[countUsers + 1];
////	    System.arraycopy(newUser, 0, newUsers, 0,countUsers);
//	    newUsers[newUsers.length - 1] = newUser;
//
//	    return newUsers;
//	}
//	
//	public void printUSers(User[] users)
//	{
//	    
//	    if(users.length > 0)
//	    {
//	        for(User u:users)
//	        {
//	            System.out.println(u.toString());
//	        }
//	    }
//	    else
//	    {
//	        System.out.println("No Users Currently Registered");
//	    }
//	}

}