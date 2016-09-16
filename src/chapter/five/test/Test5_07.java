package chapter.five.test;

public class Test5_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=10000;
		int sum=0;
		for(int i=0;i<10;i++){
			if(i<4)
			sum+=number;
			number*=1.05;
			System.out.println(number);
		}
		System.out.println(sum);
	}

}
