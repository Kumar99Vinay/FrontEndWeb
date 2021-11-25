package Setdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class LIstSetDemo {

	public static void main(String[] args) {
		Set<String> nameset=new HashSet<String>();
		System.out.println(nameset);
		nameset.add("Hari");
		nameset.add("kalpesh");
		nameset.add("Yash");
		nameset.add("Hari");
		nameset.add("Piyali");
		nameset.add("Sanjeeta");
		nameset.add("Piyali");
		nameset.add("sanjeeta");
		
		System.out.println(nameset);
		Boolean r=nameset.remove("Kalpesh");
		System.out.println(r);
		System.out.println(nameset);
		System.out.println(nameset.isEmpty());
		
		System.out.println("Enhanced for");
		for(String name:nameset) {
			System.out.println(name);
		}
		
		System.out.println("For each method");
		nameset.forEach(nm->System.out.println(nm));
		System.out.println("using iterator");
		Iterator<String>itr=nameset.iterator();
		while(itr.hasNext()) {
			String name=itr.next();
			if(name.equals("Piyali")) {
				itr.remove();
			}else {
				System.out.println(name);
			}
		}
		
		
		 ArrayList<String> nameList = new ArrayList<>(); System.out.println(nameList);
		  nameList.add("Sagar"); nameList.add("Pratiksha"); nameList.add("Vishal");
		  nameList.add("Sagar"); nameList.add("Adesh");// can be accessed via index
		  nameList.add("Sagar");
		  
		  nameList.add(2, "Sam"); nameList.add(null);// Nulls are allowed
		  System.out.println(nameList);// null pointer exception occure if comparing
		  
	
	//Normal For loop
			for (int i = 0; i < nameList.size(); i++) {
				String name = nameList.get(i);
				System.out.println(name);
			}
			
			//forEach
			System.out.println("ForEach ArrayList");
			nameList.forEach(nm -> System.out.println(nm));
			
			
			System.out.println("--- List Iterator ---");
			System.out.println("-----Forward--------");
			ListIterator<String> litr = nameList.listIterator();
			while(litr.hasNext()) {
				int index = litr.nextIndex();
				if(index == 3) {
					litr.add("Poonam");
				}
				
				String nme = litr.next();
				if(nme ==null) {
					litr.set("FilledSpace");
				}
				System.out.println(nme);
				
			}
			
			System.out.println("--- Backword---");
			while(litr.hasPrevious()) {
				String nem = litr.previous();
				System.out.println(litr.previousIndex());
				System.out.println(nem);
				
			}

	}

}
