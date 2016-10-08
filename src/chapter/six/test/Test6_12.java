package chapter.six.test;

public class Test6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printChars('1','Z', 10);
	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {
		for (int i = (int) ch1, j = 1; i <= (int) ch2; i++, j++) {
			System.out.print((char) i + " ");
			if (j % numberPerLine == 0)
				System.out.println();

		}
	}

}
