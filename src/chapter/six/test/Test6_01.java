package chapter.six.test;

public class Test6_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			System.out.print(getPentagonalNumber(i)+" ");
			if (i % 10 == 0)
				System.out.println();

		}
	}

	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;
	}

}
