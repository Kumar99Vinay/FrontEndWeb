package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorTest {

	public static void main(String[] args) {
		
		List<Integer> listInt=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		Set<Integer> setInt=listInt.stream().filter(i -> i>20).collect(Collectors.toSet());
		System.out.println(setInt);
		
		long counter =listInt.stream().collect(Collectors.counting());
		System.out.println("count :"+counter);
		
		List<Student> students=new ArrayList<Student>();
		students.add(new Student(1,90));
		students.add(new Student(2,80));
		students.add(new Student(3,70));
		students.add(new Student(4,90));
		
		int totalm=students.stream().collect(Collectors.summingInt(st -> st.marks));
		System.out.println("total marks :"+totalm);
		
		double avgmarks=students.stream().collect(Collectors.averagingDouble(st -> st.marks));
		System.out.println("Average marks :"+avgmarks);
		
		System.out.println(students.stream().collect(Collectors.groupingBy(st -> st.marks)));
		System.out.println(students.stream().collect(Collectors.groupingBy(st -> st.marks,Collectors.counting())));
		
		
		
		setInt.clear();
		listInt.clear();

	}

}

class Student{
	int id;
	int marks;
	public Student(int id, int marks) {
		super();
		this.id = id;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return " id: "+id+"  marks: "+marks;
	}
	
	
	
	
}
