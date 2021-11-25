package java8features;

interface Showable{
	void show();
}

interface Showable2{
	void show2(String msg); //Passed Argument
}

public class MethodReferenceTest {
	
	public MethodReferenceTest() {}
	
	public MethodReferenceTest(String msg) {
		System.out.println(msg);
	}
	
	public static void showtext() {//static method
		System.out.println("Hii I am static method");
	}
	
	public void showtext2() {//instancwe method
		System.out.println("HI I am Instance method");
	}
	

	public static void main(String[] args) {
		//refer static method
		Showable s=MethodReferenceTest::showtext;
		s.show();
		
		new Thread(MethodReferenceTest::showtext).start();
		
		System.out.println("============");
		
		MethodReferenceTest obj=new MethodReferenceTest();
		Showable s2=obj::showtext2;
		s2.show();
		
		new Thread(new MethodReferenceTest()::showtext2).start();
		
		Showable2 s3=MethodReferenceTest::new;
		s3.show2("Welcome to the java 8"); //Passed msg

	}

}
