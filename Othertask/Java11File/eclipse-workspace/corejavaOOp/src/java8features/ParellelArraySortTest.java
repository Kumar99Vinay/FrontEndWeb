package java8features;

import java.util.Arrays;

public class ParellelArraySortTest {

	public static void main(String[] args) {
		int numbers[]= {22,10,25,22,21,23,0,1,2,9,99,5,65,36,65};
		Arrays.parallelSort(numbers);
		Arrays.stream(numbers).forEach(n -> System.out.print(n+" "));
		System.out.println("\n==============");
		
		int numbers2[]= {22,10,25,22,21,23,0,1,2,9,99,5,65,36,65};
		Arrays.parallelSort(numbers2,2,10);//9-2 
		Arrays.stream(numbers2).forEach(n -> System.out.print(n+" "));
		System.out.println("\n==============");
		

	}

}
