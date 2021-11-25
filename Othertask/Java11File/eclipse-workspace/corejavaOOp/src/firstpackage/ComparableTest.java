package firstpackage;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparableTest {

	public static void main(String[] args) {
		ArrayList<Candidate> students=new ArrayList<Candidate>();
		students.add(new Candidate(101,"abitha","java",90));
		students.add(new Candidate(102,"mayank","java",80));
		students.add(new Candidate(103,"samadhan","php",70));
		students.add(new Candidate(104,"vinay","anguular",30));
		students.add(new Candidate(103,"rohit","Android",70));
		
		Collections.sort(students);
		for (Candidate candidate: students) {
			System.out.println(candidate);
		}
		
		System.out.println("===============");
		
		Candidate student1=Collections.min(students);
		Candidate student2=Collections.max(students); 
		System.out.println("MIN  "+student1);
		System.out.println("MAX  "+student2);
		students.clear();

	}

}

class Candidate implements Comparable<Candidate>{
	int stid;
	String name;
	String course;
	int marks;
	public Candidate(int stid, String name, String course, int marks) {
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
	
	public int compareTo(Candidate o) {
		if(this.marks == o.marks)
			return 0;
		else if(this.marks > o.marks)
		    return 1;
		else 
			return -1;
		
	}
	
	
	
}
