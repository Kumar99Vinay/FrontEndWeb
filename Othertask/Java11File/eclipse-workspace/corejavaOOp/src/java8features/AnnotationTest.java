package java8features;


import java.util.ArrayList;
import java.util.Date;

public class AnnotationTest {
	@SuppressWarnings({"unchecked","rawtypes", "deprecation"})
	public static void main(String[] args) {
		new Child().show();
		ArrayList a=new ArrayList();
		a.add("abc");
	    a.add("xyz");
	    
	    System.out.println(a);
	    
	    System.out.println(new Date().getHours());
		

	}

}

class Parent{
	public void show() {
		System.out.println("Parent method");
	}
}

class Child extends Parent{
	@Deprecated//it may remove in  fiture version
	public void show() {
		System.out.println("Child method");
	}
}

class check{
	
	void show() {
		System.out.println("show");
	}
}