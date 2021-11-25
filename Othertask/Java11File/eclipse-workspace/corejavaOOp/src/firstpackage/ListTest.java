package firstpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ListTest {

	public static void main(String[] args) {
		
		ArrayList<Student> students=new ArrayList<Student>();
		students.add(new Student(101,"abitha","java",90));
		students.add(new Student(102,"mayank","java",80));
		students.add(new Student(103,"samadhan","php",70));
		students.add(new Student(104,"vinay","anguular",30));
		students.add(new Student(103,"rohit","Android",70));
		
		Iterator<Student> itr=students.iterator();
		while(itr.hasNext()) {
			Student student=itr.next();
			System.out.println(student);
		}
		students.remove(4);
		students.add(1,new Student(100,"abcd","java",80));
		students.add(new Student(111,"xyz","hii",78));
		
		System.out.println("===================");
		
		for(Student student:students)
			System.out.println(student);
		
		students.clear();
		
		System.out.println("==============================");
		
		ArrayList complexList=new ArrayList(Arrays.asList(null,"abc",100,10.50,true));
		
		complexList.addAll(1,Arrays.asList(10f,"java")); 
		
		for(Object obj:complexList)
			System.out.println(obj);
		int sum=0;
		for(Object ob:complexList) {
			if(ob instanceof Integer) {
				sum += Integer.parseInt(ob.toString());
				
			}
		}
		System.out.println("sum="+sum);
			
			
		
		complexList.clear();
		
		LinkedList<Object> complexLinkedList=new LinkedList<Object>(Arrays.asList(null,"abc",100,10.50,true));
		complexLinkedList.add(2,"java");
		complexLinkedList.addFirst(1.8);
		System.out.println("============");
		System.out.println(complexLinkedList.removeLast());
		System.out.println("============");
		System.out.println(complexLinkedList.getLast());
		System.out.println("=============");
		for(Object obj:complexLinkedList)
			System.out.println(obj);
		complexLinkedList.clear();
	
		
		
		

	}

}

class Student{
	int stid;
	String name;
	String course;
	int marks;
	public Student(int stid, String name, String course, int marks) {
		super();
		this.stid = stid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "stid:  "+stid+"   Name:  "+name+"  course:  "+course+"  marks:  "+marks;
	}
	
	
	
	
}
