package com.neosoft;




import com.neosoft.controller.StudentController;

public class StudentMainApp {

	public static void main(String[] args) throws Exception {
		//get Student name and marks
		
//		StudentController.getAllStudents().stream().forEach(
//				student -> System.out.println(student.getStname()+" : "+student.getMarks()));
//		
//		
//		System.out.println("----------");
//		
//		StudentController.getAllStudents().stream().filter(st -> st.getMarks() > 92)
//		.forEach(st -> System.out.println(st.getStname()+" : "+st.getMarks()));
//		
			
		StudentController.getAllStudents().stream().forEach(
				student -> System.out.println(student.getStname() +" : "+ student.getMarks()));
		
		System.out.println("---------------------------");
		
		StudentController.getAllStudents().stream().filter(st -> st.getMarks() >= 70 ).forEach(st -> System.out.println(st.getStname()+" : "+st.getMarks()));


		}

	

}
