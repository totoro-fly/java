package chapter.four.test;

public class Test4_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double random1 = roll();
		double random2 = roll();
		double random3 = roll();
		double r = 40;
		double x1 = r * Math.cos(random1);
		double y1 = r * Math.sin(random1);
		double x2 = r * Math.cos(random2);
		double y2 = r * Math.sin(random2);
		double x3 = r * Math.cos(random3);
		double y3 = r * Math.sin(random3);
		double a = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		double Z=A+B+C;
		System.out.println("The three angles are "+Math.round(A*100)/100.0+"  "+Math.round(B*100)/100.0+"  "+Math.round(C*100)/100.0+"  "+Z);
		System.exit(0);

	}

	static double roll() {
		double random;
		for (;;) {
			random = Math.random() * 2 * Math.PI;
			if (random != 0)
				break;
		}
		return random;
	}

}
