package chapter.six.test;

public class Test6_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(sumDigits(998));
	}
	public static int sumDigits(long n){
		int sum=0;
		for(;;){
			sum+=n%10;
			n=n/10;
			if(n==0)
				break;
		}
		return sum;
	}

}
