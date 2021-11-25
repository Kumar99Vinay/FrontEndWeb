package secondpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LamdaExpressiontask {

	public static void main(String[] args) {
		
		
		List<Employee>emp=new ArrayList<Employee>();
		emp.add(new Employee(101,"Abhisek", 3000));
		emp.add(new Employee(103,"Rohan", 5000));
		emp.add(new Employee(102,"Kapil", 2000));
		emp.add(new Employee(105,"Sumit", 3500));
		emp.add(new Employee(104,"Kuldeep", 6000));
		emp.add(new Employee(106,"Abhay", 3400));
		
		Set<String> sal = emp.stream().filter(element -> element.esal<4500)
				.map(element->element.ename)
				.collect(Collectors.toSet());
				System.out.println(sal);
		

	}

}

class Employee{
	 int eid;
	 String ename;
	int esal;
	public Employee(int eid, String ename, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	
	
	
	
}
