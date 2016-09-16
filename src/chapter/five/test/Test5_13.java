package chapter.five.test;

public class Test5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (true) {
			if (Math.pow(i, 3) > 12000)
				break;
			i++;
		}
		System.out.println(i - 1);
	}

}
