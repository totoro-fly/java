package chapter.three;

public class Test3_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=9,y=1;
		System.out.println(x>0&&x<10);
		System.out.println((x>0)&&(x<10));
		System.out.println(x>0||x<10);
		System.out.println((x>0)||(x<10));
		System.out.println(x>0||x<10&&y<0);//&&>||
		System.out.println(x>0||(x<10&&y<0));
	}

}
