package BulkOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOperation {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(12,34,56,66,56,78);
		System.out.println(list1.getClass());
		System.out.println(list1);
		
		List<Integer> list2=Arrays.asList(23,12,90,45,67,89);
		System.out.println(list2);
		List<Integer> list3=new ArrayList<Integer>();
		list3.add(23);list3.add(13);list3.add(13);list3.add(24);
		list3.add(66);list3.add(24);list3.add(25);
		System.out.println("List3:"+list3);
		
		List<Integer> list4=new ArrayList<Integer>();
		list3.add(43);list3.add(14);list3.add(13);list3.add(24);
		list3.add(46);list3.add(14);list3.add(25);
		
		System.out.println("List4: "+list4);
		
		List<Integer> list5=new ArrayList<Integer>();
		list5.add(66);
		list5.add(25);
		System.out.println("List5:"+list5);
		
		list3.retainAll(list2); //Commons retained
//		System.out.println("Retained list 3 : "+lst3);
		
		list3.removeAll(list2);
		System.out.println("List 2 removed from list 3 : "+list3);
		
		

	}

}
