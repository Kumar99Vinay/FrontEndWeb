package java8features;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressionTest3 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(101);list.add(102);list.add(103);list.add(104);list.add(105);
		
		list.forEach((number) ->{
			if(number>102)
				System.out.println(number+" ");
		});

	}

}
