package chapter.three;

public class Test3_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, score = 0, scale = 3;
		if (x > 3)
			score = 3 * scale;
		else
			score = 4 * scale;
		System.out.println(score);
		double tax = 0, income = 100;
		if (income > 10000)
			tax = income * 0.2;
		else
			tax = income * 0.17 + 1000;
		System.out.println(tax);
		int number=8,i=1,j=2;
		if(number%3==0)
			System.out.println(i);
		else
			System.out.println(j);
		
	}

}
