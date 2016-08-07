package chapter.three.test;

import java.util.Scanner;

public class Test3_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three points for p0,p1,and p2:");
		double x0=input.nextDouble();
		double y0=input.nextDouble();
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		if((x1-x0)*(y2-y0)-(x2-x0)*(y1-y0)>0)
			System.out.println("p2在线段左侧");
		else if((x1-x0)*(y2-y0)-(x2-x0)*(y1-y0)==0)
			System.out.println("p2在线段上");
		else if((x1-x0)*(y2-y0)-(x2-x0)*(y1-y0)<0)
			System.out.println("p2在线段右侧");
		
		
		
	}

}
