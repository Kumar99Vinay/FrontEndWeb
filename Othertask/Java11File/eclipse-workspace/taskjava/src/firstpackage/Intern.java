package firstpackage;


public class Intern extends Developer {
	
	public int probation;
	public String certificate;
	
	
	
	public Intern(int eid, String ename, int deptno, double salary, String skills, String project,int probation,String certificate) {
		super(eid, ename, deptno, salary, skills, project);
		this.probation=probation;
		this.certificate=certificate;
	}



	public void showStatus() {
		System.out.println("Probation="+probation+"  certificate="+certificate);
	}

}
