package chapter.six.test;

public class Test6_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(reverse(1234));
	}
	public static String reverse(int number) {
		String str = "";
		for (;;) {
			str += number % 10;
			number = number / 10;
			if (number == 0)
				break;
		}
		return str;
	}

}
