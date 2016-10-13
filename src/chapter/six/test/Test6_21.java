package chapter.six.test;

import java.util.Scanner;

public class Test6_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = input.nextLine();
		String strNumber="";
		for (int i = 0; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i)))
				strNumber+=getNumber(str.charAt(i));
			else
				strNumber+=str.charAt(i);
		}
		System.out.println(strNumber);

	}

	public static int getNumber(char uppercaseLetter) {
		switch (uppercaseLetter) {
		case 'A':
		case 'a':
		case 'B':
		case 'b':
		case 'C':
		case 'c':
			return 2;
		case 'D':
		case 'd':
		case 'E':
		case 'e':
		case 'F':
		case 'f':
			return 3;
		case 'G':
		case 'g':
		case 'H':
		case 'h':
		case 'I':
		case 'i':
			return 4;
		case 'J':
		case 'j':
		case 'K':
		case 'k':
		case 'L':
		case 'l':
			return 5;
		case 'M':
		case 'm':
		case 'N':
		case 'n':
		case 'O':
		case 'o':
			return 6;
		case 'P':
		case 'p':
		case 'Q':
		case 'q':
		case 'R':
		case 'r':
		case 'S':
		case 's':
			return 7;
		case 'T':
		case 't':
		case 'U':
		case 'u':
		case 'V':
		case 'v':
			return 8;
		case 'W':
		case 'w':
		case 'X':
		case 'x':
		case 'Y':
		case 'y':
		case 'Z':
		case 'z':
			return 9;
		}
		return 0;

	}

}
