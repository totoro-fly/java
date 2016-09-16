package chapter.five.test;

public class Test5_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("英里\t千米\t千米\t英里");
		for (int i = 1, j = 20; i < 11; i++, j = j + 5) {
			System.out.printf(i + "\t%.3f\t" + j + "\t%.3f\n", i * 1.609, j / 1.609);
		}

	}
}
