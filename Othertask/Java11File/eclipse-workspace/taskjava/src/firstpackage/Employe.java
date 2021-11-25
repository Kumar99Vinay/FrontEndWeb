package firstpackage;


public class Employe {
	public int eid;
	public String ename;
	public int deptno;
	public double salary;
	
	
	
	public Employe(int eid, String ename, int deptno, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.deptno = deptno;
		this.salary = salary;
	}



	public void showid() {
		System.out.println("empid="+eid+"  empname="+ename+"  deptno="+deptno+"  salary="+salary);
	}	
 }

