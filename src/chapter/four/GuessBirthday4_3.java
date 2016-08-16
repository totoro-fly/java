package chapter.four;

import java.util.Scanner;

public class GuessBirthday4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=
				"1 3 5 7\n"+
				"9 11 13 15\n"+
				"17 19 29 31\n"+
				"25 27 29 31\n";
		String str2=
				"2 3 6 7\n"+
				"10 11 14 15\n"+
				"18 19 22 23\n"+
				"26 27 30 31\n";
		String str3=
				"4 5 6 7\n"+
				"12 13 14 15\n"+
				"20 21 22 23\n"+
				"25 29 30 31\n";
		String str4=
				"8 9 10 11\n"+
				"12 13 14 15\n"+
				"24 25 26 27\n"+
				"28 29 30 31\n";
		String str5=
				"16 17 18 19\n"+
				"20 21 22 23\n"+
				"24 25 26 27\n"+
				"28 29 30 31\n";
		Scanner input=new Scanner(System.in);
		System.out.println("Is your birthday in Set1?");
		System.out.print(str1);
		System.out.println("Enter 0 for and 1 for yes:");
		int day=0;
		if(input.nextInt()==1)
			day+=1;
		System.out.println("Is your birthday in Set2?");
		System.out.print(str2);
		System.out.println("Enter 0 for and 1 for yes:");
		if(input.nextInt()==1)
			day+=2;
		System.out.println("Is your birthday in Set3?");
		System.out.print(str3);
		System.out.println("Enter 0 for and 1 for yes:");
		if(input.nextInt()==1)
			day+=4;
		System.out.println("Is your birthday in Set4?");
		System.out.print(str4);
		System.out.println("Enter 0 for and 1 for yes:");
		if(input.nextInt()==1)
			day+=8;
		System.out.println("Is your birthday in Set5?");
		System.out.print(str5);
		System.out.println("Enter 0 for and 1 for yes:");
		if(input.nextInt()==1)
			day+=16;
		System.out.println("Your birthday is "+day+"!");



		
		
	}

}
