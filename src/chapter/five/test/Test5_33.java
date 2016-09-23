package chapter.five.test;

public class Test5_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=1;
		for (int i = 2; i <= 10000; i++) {
			for (int j = 2; j < i; j++) {
					if(i%j==0)
					sum+=j;	
			}
			if(sum==i)
				System.out.println(i);
			else
				sum=1;
		}
	}

}
