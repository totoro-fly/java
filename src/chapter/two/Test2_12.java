package chapter.two;

public class Test2_12 {
	public static void main(String[] args) {
		int today = 2;
		int afterDay = (today + 100) % 7;// 100天之后周几
		System.out.println(afterDay);
	}
}
