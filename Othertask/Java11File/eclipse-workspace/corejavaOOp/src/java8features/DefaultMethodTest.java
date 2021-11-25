package java8features;

interface DefaultShow{
	default void showMessage() {
		System.out.println("Default message from default method");
	}
	static void showMsgStatic() {
		System.out.println("Static method message");
	}
	void show(String msg);
}

public class DefaultMethodTest implements DefaultShow {
	
	@Override
	public void show(String msg) {
		System.out.println("Message is : "+msg);
		
	}

	public static void main(String[] args) {
		
		DefaultMethodTest obj = new DefaultMethodTest();
		obj.show("java");
		obj.showMessage();
		
		 DefaultShow.showMsgStatic();
		
		

	}

}
