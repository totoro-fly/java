import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * // // TODO Auto-generated method stub // Scanner input=new
		 * Scanner(System.in); // Scanner inputStr=new Scanner(System.in); //
		 * System.out.println("Enter"); // //int x=input.nextInt(); // //double
		 * y=input.nextDouble(); // String str=inputStr.nextLine(); // String
		 * str1=inputStr.nextLine(); // //System.out.println(x); //
		 * //System.out.println(y); // System.out.println(str); //
		 * System.out.println(str1); // double x=Math.random();
		 *
		 */
		// System.out.println((char)((int)'A'+25));
		// double number=1000;
		// double temp=0.1;
		// System.out.println(number);
		// while(number!=0){
		// number=number-temp;
		// System.out.println(number);
		// // }
		// System.out.println(1 % 3);
		// int sum=1;
		// for(int i=0;i<10000;i++)
		// for(int j=0;j<10000;j++)
		// for(int k=0;k<10000;k++)
		// System.out.println(sum++);
		// int sum=0;
		// for(int i=1;i<=10;i++){
		// sum+=i;
		// }
		//
		// System.out.println();
		// }
		System.out.println(max(1, 2));
		System.out.println(max(3.0, 2));
		System.out.println(max(1, 2.0));
		System.out.println(max(1.0, 2.0));

	}

	public static double max(double n1, int n2) {
		if (n1 > n2)
			return n1;
		else
			return n2;
	}

	public static double max(double n1, double n2) {
		if (n1 > n2)
			return n1;
		else
			return n2;
	}
}
