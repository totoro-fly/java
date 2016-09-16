package chapter.five.test;

public class Test5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		for (int i = 1;; i++) {
			if (Math.pow(i, 2) > 12000) {
				max = i;
				break;
			}
		}
		System.out.println(max);
	}

}
