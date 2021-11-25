package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LamdaExpressionTest5 {

	public static void main(String[] args) {
		List<Mobile> mobiles=new ArrayList<Mobile>();
		mobiles.add(new Mobile(1,"Samsung",15000));
		mobiles.add(new Mobile(2,"Vivo",14000));
		mobiles.add(new Mobile(3,"REdme",16000));
		mobiles.add(new Mobile(4,"Apple",1500));
		mobiles.add(new Mobile(5,"Samsung",40000));
		
		Collections.sort(mobiles,(m1,m2) -> m1.name.compareTo(m2.name));
		mobiles.forEach((mobile) -> System.out.println(mobile.name));
		
		System.out.println(" =================");
		
		Collections.sort(mobiles,(m1,m2) -> m1.id-m2.id);
		mobiles.forEach((mobile) -> System.out.println(mobile.id));
		
		System.out.println("================");
		
		List<Integer>lst=new ArrayList<Integer>();
		lst.forEach(System.out::println);
		
	
		
		
		
		mobiles.clear();

	}

}

class Mobile{
	int id;
	String name;
	double price;
	public Mobile(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}
