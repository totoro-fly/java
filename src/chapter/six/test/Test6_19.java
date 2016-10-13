package chapter.six.test;

public class Test6_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=area(3, 4, 3);
		if(number==0)
			System.out.println("输入非法。");
		else
			System.out.println("面积："+number);
			
	}

	public static double area(double side1, double side2, double side3) {
		if (isValid(side1, side2, side3)) {
			double s = (side1 + side2 + side3) / 2.0;
			double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 1.0 / 2.0);
			return area;
		} else {
			return 0;
		}
	}

	public static boolean isValid(double side1, double side2, double side3) {
		if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2) {
			return true;
		} else
			return false;
	}

}
