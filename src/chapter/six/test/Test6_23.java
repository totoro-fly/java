package chapter.six.test;

public class Test6_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("fioushqufosahvuioqnwirohfakjhfdoqiuh", 'a'));
	}
	public static int count(String str,char a){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(a==str.charAt(i))
				count++;
		}
		return count;
	}

}
