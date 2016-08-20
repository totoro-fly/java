package chapter.four.test;

import java.util.Scanner;

public class Test4_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//北京上海广州重庆
		double x1 = Math.toDegrees(39.90);
		double y1 = Math.toDegrees(116.40);
		double x2 = Math.toDegrees(31.23);
		double y2 = Math.toDegrees(121.47);
		double x3 = Math.toDegrees(23.12);
		double y3 = Math.toDegrees(113.26);
		double x4 = Math.toDegrees(29.56);
		double y4 = Math.toDegrees(106.55);
		double r=6371.01;
		double d1=r*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		double d2=r*Math.acos(Math.sin(x2)*Math.sin(x3)+Math.cos(x2)*Math.cos(x3)*Math.cos(y2-y3));
		double d3=r*Math.acos(Math.sin(x3)*Math.sin(x4)+Math.cos(x3)*Math.cos(x4)*Math.cos(y3-y4));
		double d4=r*Math.acos(Math.sin(x4)*Math.sin(x1)+Math.cos(x4)*Math.cos(x1)*Math.cos(y4-y1));
		double dd=r*Math.acos(Math.sin(x1)*Math.sin(x3)+Math.cos(x1)*Math.cos(x3)*Math.cos(y1-y3));//中线
		double s1 = (d1 + d2 + dd) / 2.0;
		double area1 = Math.pow(s1 * (s1 - d1) * (s1 - d2) * (s1 - dd), 1.0 / 2.0);
		double s2 = (d3 + d4 + dd) / 2.0;
		double area2 = Math.pow(s2 * (s2 - d3) * (s2 - d4) * (s2 - dd), 1.0 / 2.0);
		double area=area1+area2;
		System.out.println(area);
	}

}
