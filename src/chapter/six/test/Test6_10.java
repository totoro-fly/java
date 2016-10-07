package chapter.six.test;

public class Test6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=2;i<10000;i++){
			if(isPrime(i))
				count++;
		}
		System.out.println(count);
	}
	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}


}
