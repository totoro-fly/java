package chapter.five.test;

public class Test5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 0;
		double sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += Math.pow(-1, i + 1) / (2 * i - 1);
		}
		pi = 4 * sum;
		System.out.println(pi);
	}

}
