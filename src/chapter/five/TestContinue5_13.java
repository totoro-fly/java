package chapter.five;

public class TestContinue5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int number=0;
		while(number<20){
			number++;
			if(number==10||number==11)
				continue;
			sum+=number;
		}
		
		System.out.println("The sum is "+sum);
	}

}
