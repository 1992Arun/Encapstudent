package encap.org;

public class Evaluation extends Student  {
	
	
	
  Evaluation() {
	  
	  
		super(grade);
		
	}






public static  char grade;


	int mark ;
	


	


       
public char addGrade(int mark  ) {
		
		if (mark>=35 & mark <50) {
			
			System.out.println("PASS with E Grade");
			
			 grade = 'F';
			
			 
			
		}
		
		else if (mark >51 & mark<75 ) {
			
			System.out.println("PASS with C Grade");
			
			 grade = 'C';
		}
		
			
          else if (mark >75 & mark<90 ) {
			
			System.out.println("PASS with B Grade");
			
			 grade = 'B';
		}
			
          else if (mark >90 & mark<100 ) {
  			
  			System.out.println("PASS with A Grade");
  			
  			 grade = 'A';
  		}
		
          else if (mark <35 ) {
    			
    			System.out.println("FAIL");
    			
    			 grade = 'F';
    		}
		return grade;
		
	}
	

		
	
	
	
	public static void main(String[] args) {
		
		
		Evaluation ev=  new Evaluation();
		
		ev.addGrade(56);
		
		
	System.out.println(ev.getGrades());
		
		
	}
	
}
