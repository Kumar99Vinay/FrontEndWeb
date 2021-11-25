package firstpackage;

public class Generictest {

	public static void main(String[] args) {
		TestGen1<Integer> intobj=new TestGen1<Integer>(100);
		System.out.println(intobj.getObject());
		
		TestGen1<String> strobj=new TestGen1<String>("java");
		System.out.println(strobj.getObject());
		
		System.out.println("-----------------------");
		
		TestGen2<String,Integer>strIntobj=new TestGen2("php",100);
		System.out.println(strIntobj);
		TestGen2<Integer,Double>strIntobj1=new TestGen2(100,1.2);
		System.out.println(strIntobj1);
		
		System.out.println("   -----------    ");
		TestGen3.genericMethod(8);
		TestGen3.genericMethod("java");
		TestGen3.genericMethod(1.8);
		TestGen3.genericMethod(1.8f);
		

	}

}
class TestGen1<T>{
	T obj;
	public TestGen1(T obj) {
		this.obj=obj;
		
	}
	public T getObject() {
		return this.obj;
	}
	
}

class TestGen2<T,U>{
	T obj1;
	U obj2;
	public TestGen2(T obj1,U obj2) {
		this.obj1=obj1;
		this.obj2=obj2;
		
	}
	public String toString() {
		return this.obj1+" , "+this.obj2;
	}
	
	
}

class TestGen3{
	static<T> void genericMethod(T element) {
		System.out.println(element.getClass().getName()+" = "+element);
		
	}
}
