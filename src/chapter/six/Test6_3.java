package chapter.six;

public class Test6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		int j=2;
		int k=max(i,j);
		System.out.println("The maximum of "+i+" and "+j+" is "+k);
	}
	public static int max(int num1,int num2){
		return num1>num2?num1:num2;
		
	}

}
