package consoleBankApp;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUid = 1L;
	
	protected String name;
	protected String address;
	protected String contact;
	protected String username;
	protected String password;
	protected String InitialDep;
	protected double balance;
	static int countUsers = 0;
	
    //private static NumberFormat formatter = new DecimalFormat("#0.00");


//    @Override
//    public String toString() {
//        return String.format("ID: %d\r\nDepartment: %s\r\nName: %s\r\nPrice: %s\r\nStock: %d\r\n", 
//                id, department, name, formatter.format(price), stock);
//    }

	public User(String name, String address, String contact, String username, String password, String initialDep,double balance) {
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.username = username;
		this.password = password;
		this.InitialDep = initialDep;
		this.balance = balance;
		countUsers++;
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
		balance = balance;
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

