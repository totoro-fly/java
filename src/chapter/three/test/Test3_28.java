package chapter.three.test;

import java.util.Scanner;

public class Test3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���������ཻ������:�������ε����ľ�����X��Y���϶�С���������γ�����һ��֮��.����,�������ж�һ�¾�����.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rl's center x-,y-coordinates,width,and height:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		System.out.println("Enter r2's center x-,y-coordinates,width,and height:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		if(Math.abs(x2 - x1) <= (width1 + width2) / 2 && Math.abs(y2 - y1) <=(height1 + height2) / 2)
			System.out.println("r2 is inside r1");
		else
			System.out.println("r2 does not overlaps r1");
	}

}
