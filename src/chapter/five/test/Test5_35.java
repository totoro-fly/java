package chapter.five.test;

public class Test5_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=1;i<=624;i++){
			sum+=1/(i+Math.sqrt(i+1));
		}
		System.out.println(sum);
	}

}
