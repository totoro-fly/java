package chapter.five.test;

public class Test5_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e=1;
		double item=1;
		for(int i=1;i<=1000000;i++){
			item/=i;
			e+=item;
		}
		System.out.println(e);
	}

}
