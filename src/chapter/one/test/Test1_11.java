package chapter.one.test;

public class Test1_11 {

	public static void main(String[] args) {
		System.out.println("当前人口数312032486,7s加1,13s减1,45s加1,未来5年每年人口数");
		double s = 312032486;
		float t = 60 * 60 * 24 * 365;
		double g = t / 7.0 + t / 45.0 - t / 13.0;
		System.out.println(t);
		System.out.println(g);
		for(int i = 1;i < 6;i++,s = s + g){
			System.out.println(i+"    "+s);
		}
	}

}
