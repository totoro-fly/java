package chapter.five.test;

import java.util.Scanner;

public class Test5_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个十进制数");
		int number = input.nextInt();
		String str1 = "";
		String str2="";
		for (;;) {
			if (number == 1) {
				str1 += 1;
				break;
			}
			if (number % 2 == 0) {
				number = number / 2;
				str1 += 0;
			} else {
				number = (number - 1) / 2;
				str1 += 1;
			}
		}
		for (int i = str1.length()-1; i>=0; i--) {
			str2+=str1.charAt(i);
		}
		System.out.println(str2);
	}

}
