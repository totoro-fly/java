package chapter.six.test;

public class Test6_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isPalindrome(1124211));

	}

	public static boolean isPalindrome(int number) {

		String number2 = reverse(number);
		if (number2.equals(Integer.toString(number)))
			return true;
		else
			return false;
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
