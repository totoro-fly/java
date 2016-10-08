package chapter.six.test;

public class Test6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("i\t\tm(i)\n");
		System.out.print("----------------------\n");
		for(int i=1;i<=20;i++){
			System.out.printf(i+"\t\t%.4f\n",sunOfSeguence(i));
		}
	}

	public static double sunOfSeguence(int number) {
		double sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += (double)i / ((double)i + 1);
		}
		return sum;
	}

}
