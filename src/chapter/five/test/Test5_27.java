package chapter.five.test;

public class Test5_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 101; i <= 2100; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
				System.out.print(i+" ");
				count++;
			}
			if (count % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("\t\t"+count);
		
	}

}
