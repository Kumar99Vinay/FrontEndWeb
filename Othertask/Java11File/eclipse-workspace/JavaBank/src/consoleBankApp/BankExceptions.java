package consoleBankApp;
public class BankExceptions extends Exception {
	String msg;

	public BankExceptions(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return msg;
	}
	
}
