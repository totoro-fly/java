package chapter.two.test;

import java.util.Scanner;

public class Test2_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long milliTimes=System.currentTimeMillis();
		long times=milliTimes/1000;
		long seconds=times%60;
		long remain=times/60;
		long minuites=remain%60;
		remain/=60;
		long hours=remain%24;
		System.out.println("Time "+hours+":"+minuites+":"+seconds+" GMT");
		System.out.println("Enter the time zone offset to GMT:");
		Scanner input=new Scanner(System.in);
		int offset=input.nextInt();
		long offsetHours=hours+offset;
		System.out.println("The current time is "+offsetHours+":"+minuites+":"+seconds);
		
			
	}

}
