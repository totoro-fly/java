package chapter.five.test;

import java.util.Scanner;

public class Test5_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter ten numbers");
		double avg=0;
		double f=0;
		double fS=0;
		double sum=0;
		double[] a=new double[10];
		for(int i=0;i<10;i++){
			a[i]=input.nextDouble();
			sum+=a[i];
		}
		avg=sum/10;
		for(int i=0;i<10;i++){
			fS+=Math.pow(a[i]-avg, 2);
		}
		f=Math.sqrt(fS/9);
		System.out.println(avg+"\t"+f);
	}

}
