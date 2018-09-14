
public class Grade {
	private int number;

	
	  //this is an empty constructor	
	public Grade() {
		number = 0;
	    }
	
	  //this is a constructor
	public Grade(int number) {
		this.number = number;
	}
	
	// convert the number to a letter grade
	public String getLetter() {
		String letterGrade = "";
		
		if (number >= 88) {
			letterGrade = "A";
		} else if (number >= 80) {
			letterGrade = "B";
		} else if (number >= 68) {
			letterGrade = "C";
		} else if (number >= 60) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		
		return letterGrade;
	}
	
	public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }  
    
}
