package chapter.five;

public class MultiplicationTable5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t\tMultiplication table");
		for (int i = 1; i <= 9; i++)
			System.out.print("\t " + i);
		System.out.print("\n\t-------------------------------------------------------------------\n");
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "|");
			for (int j = 1; j <= 9; j++)
				System.out.printf("\t%2d", i * j);
			System.out.print("\n");

		}

	}

}
