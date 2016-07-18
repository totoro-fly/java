package chapter.one.test;

public class Test1_10 {
	public static void main(String[] args) {
		System.out.println("平均=路程/时间");
		System.out.println("t=45分钟30秒，s=14公里，1英里=1.6公里");
		System.out.println("14/1.6/（（（30/60）+45）/60）");
		System.out.println((14 / 1.6) / ((30 / 60 + 45) / 60) + "英里/小时");
		System.out.println(30.0 / 60.0);
		System.out.println((14 / 1.6) / ((30.0 / 60.0 + 45) / 60) + "英里/小时");
	}
}