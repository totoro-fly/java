package chapter.four;

public class FormatDemo4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degress", "Radians", "Sine", "Cosine", "Tangent");
		int degress = 30;
		double radians = Math.toRadians(degress);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degress, radians, Math.sin(radians), Math.cos(radians),
				Math.tan(radians));
		degress = 60;
		radians = Math.toRadians(degress);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degress, radians, Math.sin(radians), Math.cos(radians),
				Math.tan(radians));
	}

}
