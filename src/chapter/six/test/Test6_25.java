package chapter.six.test;

public class Test6_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(converMillis(555550000));
	}
	public static String converMillis(long millis){
		String str="";
		int sunSecond=(int) (millis/1000);
		int second=sunSecond%60;
		int remainSecond=sunSecond/60;
		int minute=remainSecond%60;
		int remainMinute=remainSecond/60;
		int hour=remainMinute;
		return str=hour+" "+minute+" "+second;
	}

}
