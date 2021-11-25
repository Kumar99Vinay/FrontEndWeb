package collectionTask;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;



public class LinkedHasMapDemo {

	public static void main(String[] args) {
		Map<Integer, Double> emp=new LinkedHashMap<Integer, Double>();
		emp.put(101, 20000.0);emp.put(102, 15000.0);emp.put(103, 30000.0);
		emp.put(104, 12000.0);emp.put(105, 18000.0);emp.put(106, 50000.0);
		
		System.out.println(emp);
		System.out.println("=======");
		
		for (Map.Entry m : emp.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("======");
		
		System.out.println("Keys: " + emp.keySet());// Fetching key
		System.out.println("Values: " + emp.values());// Fetching value
		System.out.println("Key-Value pairs: " + emp.entrySet());// Fetching key-value pair
		System.out.println("=======");
		emp.remove(102);
		System.out.println(emp.entrySet());
		System.out.println("=======");
		System.out.println(emp.get(104));
		System.out.println("=========");
		
		   System.out.println("Printing elements of the LinkedHashMap : ");

		   Iterator<Entry<Integer,Double>> itr=emp.entrySet().iterator();
			while(itr.hasNext()) {
				Entry<Integer,Double> entry=itr.next();
				System.out.println(entry);
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}

	}

}
