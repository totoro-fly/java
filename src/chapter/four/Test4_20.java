package chapter.four;

public class Test4_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome";
		String s2 = "welcome";
		boolean isEqual1 = s1.equals(s2);
		System.out.println(isEqual1);
		boolean isEqual2 = s1.equalsIgnoreCase(s2);
		System.out.println(isEqual2);
		int x1 = s1.compareTo(s2);
		System.out.println(x1);
		int x2 = s1.compareToIgnoreCase(s2);
		System.out.println(x2);
		boolean b1 = s1.startsWith("AAA");
		System.out.println(b1);
		boolean b2 = s1.endsWith("AAA");
		System.out.println(b2);
		int xg=s1.length();
		System.out.println(xg);
		char xh=s1.charAt(0);
		System.out.println(xh);
		String s3=s1+s2;
		System.out.println(s3);
		String sj=s1.substring(1);
		System.out.println(sj);
		String sk=s1.substring(1, 5);
		System.out.println(sk);
		String sl=s1.toLowerCase();
		System.out.println(sl);
		String sm=s1.toUpperCase();
		System.out.println(sm);
		String sn=s1.trim();
		System.out.println(sn);
		int xo=s1.indexOf('e');
		System.out.println(xo);
		int xp=s1.lastIndexOf("abc");
		System.out.println(xp);
		System.out.println(s1.lastIndexOf("me"));
		
		

	}

}
