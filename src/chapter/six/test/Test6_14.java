package chapter.six.test;

public class Test6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("i\t\tm(i)\n");
		System.out.print("----------------------\n");
		for (int i = 1; i <= 901; i=i+100) {
			System.out.printf(i + "\t\t%.4f\n", estimatePi(i));
		}
	}

	public static double estimatePi(int number) {
		double sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += 4 * ((double) Math.pow(-1, i + 1) / (double) (2 * i - 1));
		}
		return sum;
	}

}
