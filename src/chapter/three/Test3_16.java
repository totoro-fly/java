package chapter.three;

public class Test3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number1 = (int) (Math.random() * 20);
		double number2 = (int) (Math.random() * 10 + 10);
		double number4 = (int) (Math.random() * 10);
		int number5 = 0;
		if (number4 % 2 == 0)
			number5 = 0;
		else
			number5 = 1;
//		double number3 = (int) (Math.random() * 50 + number5);
		double number3 = (int) (49 + number5);
		System.out.println(number3);
	}

}
