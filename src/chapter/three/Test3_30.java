package chapter.three;

public class Test3_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3, y = 3;
		switch (x + 3) {
		case 6:
			y = 1;
		default:
			y += 1;
		}
		System.out.println(y);
		x=3;
		y=3;
		if(x+3==6)
			y=1;
		y+=1;
		System.out.println(y);
		
	}

}
