package chapter.six;

public class PrimeNumberMethod6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumber(50);
	}

	public static void printPrimeNumber(int n) {
		int count = 0;
		int number = 2;
		int isRepeat = 0;
		final int NUMBER_OF_PRINT_PER_LINE = 10;
		for (;;) {
			if (isPrime(number)) {
				System.out.printf("%-5d", number);
				count++;
			}
			number++;
			if (count % NUMBER_OF_PRINT_PER_LINE == 0) {
				if (count == isRepeat)
					continue;
				isRepeat = count;
				System.out.println();
			}
			if (count == n)
				break;
		}
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

}
