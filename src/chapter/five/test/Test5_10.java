package chapter.five.test;

public class Test5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 100; i <= 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.print(i+" ");
				count++;
				if (count % 10 == 0)
					System.out.println();
			}
		}
	}

}
