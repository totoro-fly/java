package chapter.six.test;

public class Test6_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayPattern(30);
	}

	public static void displayPattern(int n) {
		for (int i = n, l = 1; i >= 1; i--, l++) {
			for (int j = 1; j < i; j++)
				System.out.print("   ");
			for (int k = l; k >= 1; k--) {
				System.out.printf("%3d",k);
			}
			System.out.println();
		}
	}

}
