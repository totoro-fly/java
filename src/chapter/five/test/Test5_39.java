package chapter.five.test;

public class Test5_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double month = 30000 / 12;
		double x = 0;
		for (int i = 1;; i++) {
			if (i > 0.01 && i <= 5000) {
				if (i * 0.08 > month) {
					x = i;
					break;
				}
			} else if (i > 5000 && i <= 10000) {
				if (5000 * 0.08 + (i - 5000) * 0.1 > month) {
					x = i;
					break;
				}
			} else {
				if ((5000 * 0.08 + 5000 * 0.1 + (i - 10000) * 0.12) > month) {
					x = i;
					break;
				}
			}
		}
		System.out.println(x*12);
	}

}
