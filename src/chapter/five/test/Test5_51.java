package chapter.five.test;

import java.util.Scanner;

public class Test5_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first string ");
		String str1=input.nextLine();
		System.out.println("Enter the second string ");
		String str2=input.nextLine();
		String str3="";
		if(str1.charAt(0)!=str2.charAt(0)){
			System.out.println(str1+" and "+str2+" have no commen prefix.");
			System.exit(1);
		}
		int l=Math.max(str1.length(),str2.length());
		for(int i=0;i<l;i++){
			if(str1.charAt(i)==str2.charAt(i))
				str3+=str1.charAt(i);
			else 
				break;
		}
		System.out.println("The common prefix is "+str3);
	}

}
