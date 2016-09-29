package chapter.six;

public class Test6_13b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=6){
			method(i,2);
			i++;
		}
	}
	public static void method(int i,int num){
		for(int j=1;j<=i;j++){
			System.out.print(num+" ");
			num*=2;
		}
		System.out.println();
		
	}

}
