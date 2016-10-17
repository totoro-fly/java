package chapter.six.test;

public class Test6_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Math.log(4) / Math.log(2));
		printPrimePalindromicNumber(31);
	}

	public static void printPrimePalindromicNumber(int p) {
		System.out.print("p\t\t2^p-1\n");
		System.out.print("----------------------\n");
		for (int i = 2; i <= p; i++) {
			if (isPrime(mason(i)))
				System.out.print(i + "\t\t" + mason(i) + "\n");
		}
	}

	public static double mason(int p) {
		return (Math.pow(2, p) - 1);
	}

	public static boolean isPrime(double number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

}
