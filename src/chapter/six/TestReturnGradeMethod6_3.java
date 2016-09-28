package chapter.six;

public class TestReturnGradeMethod6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The grade is "+getGrade(78.5));
		System.out.println("The grade is "+getGrade(59.5));
	}
	public static char getGrade(double score){
		if(score >100||score <0)
			return '0';
		if(score>90)
			return 'A';
		else if(score>80)
			return 'B';
		else if(score >70)
			return 'C';
		else if(score >60)
			return 'D';			
		else 
			return 'F';
	}

}
