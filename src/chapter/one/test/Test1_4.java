package chapter.one.test;

public class Test1_4 {
	public static void main(String[] args) {
		System.out.println("a    a^2   a^3");
		for (int i = 1; i < 5; i++) {
			if (i == 4) {
				System.out.println(i + "     " + i * i + "    " + i * i * i);
			} else {
				System.out.println(i + "     " + i * i + "     " + i * i * i);
			}
		}
	}
}
