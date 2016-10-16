package chapter.six.test;

public class Test6_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printOppositePrimeNumber(100);
	}

	public static void printOppositePrimeNumber(int numberOfPrime) {
		int count = 0;
		int number = 2;
		final int NUMBER_OF_PRINT_PER_LINE = 10;
		while (count < numberOfPrime) {
			if (isPrime(number)) {
				if (!isPalindromicNumber(number)) {
					if (isPrime(opposite(number))) {
						count++;
						if (count % NUMBER_OF_PRINT_PER_LINE == 0)
							System.out.printf("%-7s\n", number);
						else
							System.out.printf("%-7s", number);
					}
				}
			}
			number++;
		}
	}

	public static boolean isPalindromicNumber(int number) {
		String str = number + "";
		boolean isSame = true;
		for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
			if (!(str.charAt(i) == str.charAt(j)))
				isSame = false;
		}
		return isSame;
	}

	public static int opposite(int number) {
		String str = number + "";
		String oppositeStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			oppositeStr += str.charAt(i);
		}
		return Integer.parseInt(oppositeStr);
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

}
