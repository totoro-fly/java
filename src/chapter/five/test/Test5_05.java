package chapter.five.test;

public class Test5_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ç§¿Ë\t°õ\t°õ\tÇ§¿Ë");
		for (int i = 1, j = 20; i < 200; i++, j = j + 5) {
			System.out.printf(i + "\t%.1f\t" + j + "\t%.2f\n", i * 2.2, j / 2.2);
		}

	}
}
