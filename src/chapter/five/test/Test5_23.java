package chapter.five.test;

public class Test5_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=1;i<=50000;i++){
			sum+=1.0/i;
		}
		System.out.println(sum);
		sum=0;
		for(int i=50000;i>=1;i--){
			sum+=1.0/i;
		}
		System.out.println(sum);
	}

}
