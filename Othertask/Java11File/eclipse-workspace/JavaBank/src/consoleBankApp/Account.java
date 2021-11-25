package consoleBankApp;

public class Account {
	//way1
//	double amt = Login.loginnedUser.getBalance();
//	
//	void depostAmt(double amt) {
//		this.amt += amt;
//		Login.loginnedUser.balance = this.amt;
//		 for(User u:Register.users.keySet()) {
//			 if(Login.loginnedUser.username == u.username) {
//				 u.balance = this.amt;
//			 }
//		 }
//	}
//	
//	void withdraw(double amt) {
//		this.amt -= amt;
//		Login.loginnedUser.balance = this.amt;
////		Login.loginnedUser.setBalance(this.amt);
//		for(User u:Register.users.keySet()) {
//			 if(Login.loginnedUser.username == u.username) {
//				 u.balance = this.amt;
//			 }
//		 }
//	}

	
	//way2
	double amt = Login.loginnedUser.getBalance();
	
	void depostAmt(double amt) {
		this.amt += amt;
		Login.loginnedUser.balance = this.amt;
	}
	
	void withdraw(double amt) {
		this.amt -= amt;
		Login.loginnedUser.balance = this.amt;
//		Login.loginnedUser.setBalance(this.amt);
	}
}

