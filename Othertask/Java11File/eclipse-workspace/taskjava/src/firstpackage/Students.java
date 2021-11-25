package firstpackage;

public class Students {
	Subjects subject;
	int stid;
	String stname;
	int marks;
	

	public Students(Subjects subject, int stid, String stname, int marks) {
		super();
		this.subject = subject;
		this.stid = stid;
		this.stname = stname;
		this.marks = marks;
	}



	public static void main(String[] args) {
		Students a=new Students(Subjects.JAVA,101,"abc",50);
//		Students b=new Students(Subjects.valueOf(stid));
//		Students c=new Students(Subjects.valueOf(stname));
//		Students d=new Students(Subjects.valueOf(marks));
		
		

	}

}
