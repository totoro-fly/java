package chapter.five;

public class Test5_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;sum<10000;i++){
			sum+=i;
		}
		System.out.println(sum);
		int sum1=0;
		int i1=1;
		while(sum1<10000){
			sum1=sum1+i1;
			i1++;
		}
		System.out.println(sum1);
	}

}
