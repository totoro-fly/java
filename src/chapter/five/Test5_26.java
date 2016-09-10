package chapter.five;

public class Test5_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int number = 0;
		boolean is = false;
		while (number < 20 && !is) {
			number++;
			sum += number;
			if (sum >= 100)
				is = true;
		}

		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);

		int sum2 = 0;
		int number2 = 0;
		while (number2 < 20) {
			number2++;
			if (number2 == 10 || number2 == 11)
				;
			else
				sum2 += number2;
		}

		System.out.println("The sum is " + sum2);
	}

}
