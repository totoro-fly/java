package chapter.six;

public class TestVoidMethod6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("The grade is ");
		printGrade(78.5);
		System.out.print("The grade is ");
		printGrade(59.5);
		System.out.print("The grade is ");
		printGrade(101);
	}

	public static void printGrade(double score) {
		if(score>100||score<0){
			System.out.println("Invalid score");
			return;
		}
		if (score >= 90)
			System.out.println('A');
		else if (score >= 80)
			System.out.println('B');
		else if (score >= 70)
			System.out.println('C');
		else if (score >= 60)
			System.out.println('D');
		else
			System.out.println('F');
	}

}
