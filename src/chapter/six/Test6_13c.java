package chapter.six;

public class Test6_13c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times=3;
		System.out.println("Before the call, variable times is "+times);
		nPrintln("Welcome to Java!",times);
		System.out.println("After the call, variable times is "+times);
		
	}
	public static void nPrintln(String message,int n){
		while(n>0){
			System.out.println("n= "+n);
			System.out.println(message);
			n--;
		}
	}

}
