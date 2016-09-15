package chapter.five;

public class Palindrome5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;
		System.out.println("The first 50 prime are \n");
		while (count < NUMBER_OF_PRIMES) {
			boolean isPrime = true;
			for (int divistor = 0; divistor <= number/2; divistor++) {
				if (number % divistor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
					System.out.println(number);
				else
					System.out.print(number + " ");
			}
			number++;
		}
	}

}
