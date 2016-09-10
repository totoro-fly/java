package chapter.five;

public class TestSum5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0;
		for(float i=0.01f;i<=1;i=i+0.01f){
			sum+=i;
		}

		System.out.println("Sum is "+sum);
		double sum2=0;
		for(double i=0.01;i<=1;i=i+0.01){
			sum2+=i;
		}
		System.out.println("Sum is "+sum2);
		double sum3=0;
		double currrentValue=0.01;
		for(int count =0;count<100;count++){
			sum3+=currrentValue;
			currrentValue+=0.01;
		}
		System.out.println("Sum is "+sum3);
		currrentValue=1.0;
		double sum4=0;
		for(int i=0;i<100;i++){
			sum4+=currrentValue;
			currrentValue-=0.01;
		}
		System.out.println("Sum is "+sum4);
	}

}
