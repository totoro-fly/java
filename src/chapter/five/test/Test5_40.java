package chapter.five.test;

public class Test5_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<1000000;i++){
			int number=(int)(Math.random()*2);
			System.out.println(number);
			if(number==0)
				count++;
		}
		System.out.println("���� "+count+"\n"+"���� "+(1000000-count));
	}

}
