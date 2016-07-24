package chapter.three;

public class Test3_11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 0, k = 0, x = 1, y = 1, z = 1;
		if (i > 0) {
			if (j > 0)
				x = 0;
			else if (k > 0)
				y = 0;
		} else
			z = 0;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
