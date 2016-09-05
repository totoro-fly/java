package chapter.five;

public class Test5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum=0;
		for(int i=0;i<=1000;i++){
			sum+=i;
		}
		System.out.println(sum);
		long sum1=0;int i1=0;
		while(i1<=1000){
			sum1+=i1;
			i1++;
		}
		System.out.println(sum1);
		long sum2=0;int i2=0;
		do{
			sum2+=i2;
			i2++;
		}while(i2<=1000);
		System.out.println(sum2);
	}

}
