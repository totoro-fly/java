package chapter.one.test;

public class Test1_11 {

	public static void main(String[] args) {
		System.out.println("��ǰ�˿���312032486,7s��1,13s��1,45s��1,δ��5��ÿ���˿���");
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
