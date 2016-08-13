package chapter.four;

public class Test4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a=(int)'a';
		// int z=(int)'z';
		// System.out.println(a);
		for (int i = 0; i < 100; i++) {
			int x = 97 + (int) (Math.random() * 26);
			System.out.print((char) x);
		}
	}

}
