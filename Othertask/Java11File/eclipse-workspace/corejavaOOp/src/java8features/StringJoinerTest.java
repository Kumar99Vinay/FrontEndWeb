package java8features;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		StringJoiner strjoiner=new StringJoiner("-","[","]");//first infix second prefix third suffix
		strjoiner.add("abc");
		strjoiner.add("def");
		strjoiner.add("ghi");
		strjoiner.add("jkl");
		
		System.out.println(strjoiner);
		
		StringJoiner strjoiner2=new StringJoiner(":","(",")");
		strjoiner2.add("abc");
		strjoiner2.add("def");
		strjoiner2.add("ghi");
		strjoiner2.add("jkl");
		
		System.out.println(strjoiner2);
		System.out.println(strjoiner.merge(strjoiner2));
		
		System.out.println(strjoiner2.length());
		System.out.println(strjoiner2.toString().charAt(3));
		
		
		

	}

}
