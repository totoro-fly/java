package chapter.six.test;

public class Test6_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(sqrt(2));
	}

	public static double sqrt(long n) {
		double LAST_GUESS = 2;
		double nextGuess;
		for (;;) {
			LAST_GUESS = (LAST_GUESS + n / LAST_GUESS) / 2;
			nextGuess = n / LAST_GUESS;

			if (Math.abs(nextGuess - LAST_GUESS) < 0.00000001)
				break;
		}
		return nextGuess;
	}

}
