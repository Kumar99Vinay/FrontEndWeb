package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		List<Mobile> mobiles=new ArrayList<Mobile>();
		mobiles.add(new Mobile(1,"Samsung",15000));
		mobiles.add(new Mobile(2,"Vivo",14000));
		mobiles.add(new Mobile(3,"REdme",16000));
		mobiles.add(new Mobile(4,"Apple",15000));
		mobiles.add(new Mobile(5,"Samsung",40000));
		
		List<String> mobileNames=mobiles.stream()
				.filter(mobile -> mobile.price>14000)//filter data
				.map(mobile -> mobile.name)//fetch only name
				.collect(Collectors.toList());
		System.out.println(mobileNames);
		
		mobiles.stream().filter(mobile -> mobile.price>14000)
		.forEach(mobile ->System.out.println(mobile.name));
		
		//max price
		Mobile m1=mobiles.stream().max((mob1,mob2) -> mob1.price>mob2.price ? 1:-1).get();
		System.out.println("MAx price"+m1.price);
		//min price
		Mobile m2=mobiles.stream().min((mob1,mob2) -> mob1.price>mob2.price ? 1:-1).get();
		System.out.println("min price"+m2.price);
		//count
		
		long count=mobiles.stream().filter(mobile -> mobile.price>14000).count();
		System.out.println("Counter  "+count );
		
		Set<Double> mobilePrices=mobiles.stream()
				.filter(mobile -> mobile.price>14000)//filter data
				.map(mobile -> mobile.price)//fetch only name
				.collect(Collectors.toSet());
		System.out.println(mobilePrices);
		
		
		
	
		
		mobiles.clear();
	}

}
