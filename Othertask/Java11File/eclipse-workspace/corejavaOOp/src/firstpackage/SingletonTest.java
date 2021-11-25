package firstpackage;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		Singleton obj3=Singleton.getInstance();
		
		System.out.println("Hash code of obj1"+obj1.hashCode());
		System.out.println("Hash code of obj2"+obj2.hashCode());
		System.out.println("Hash code of obj3"+obj3.hashCode());
		System.out.println("database name  "+obj3.database_name);

	}

}

class Singleton{
	
	private static Singleton single_obj=null;
	
	public String database_name;
	private Singleton(){//private constructor
		database_name="my_database";
	}
	
	public static Singleton getInstance() {
		if(single_obj == null)
			single_obj=new Singleton();
		return single_obj;
	}
	
	
}
