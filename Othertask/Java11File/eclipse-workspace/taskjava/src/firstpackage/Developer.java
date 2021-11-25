package firstpackage;


public class Developer extends Employe {
	public String skills;
	public String project;
	
	
	
	public Developer(int eid, String ename, int deptno, double salary,String skills,String project) {
		super(eid, ename, deptno, salary);
		this.skills=skills;
		this.project=project;
	}



	public void showprofile() {
		System.out.println("skills="+skills+"  project="+project);
	}
	

}
