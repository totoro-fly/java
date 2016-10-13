package chapter.six.test;

import java.util.Scanner;

public class Test6_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®");
		System.out.println("×ÖÄ¸ÊıÁ¿£º"+countLetters(input.nextLine()));
	}
	public static int countLetters(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z'))
				count++;
		}
		return count;
	}

}
