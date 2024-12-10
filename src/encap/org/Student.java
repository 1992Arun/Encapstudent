package encap.org;

public class Student {
	
	private int student_id;
	private String student_name;
	private char grades;
	
    
	
	Student(char grades){
		
		this.grades= grades;
		
	}
   
	
	
	
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
		
	}
	
	
	
	public int getStudent_id() {
		return student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public char getGrades() {
		return grades;
	}
	
	
	
	public void addGrade(char grades) {
		
		
		
		this.grades=grades;
	}
	

}
