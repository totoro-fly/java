package chapter.five.test;

import java.util.Scanner;

public class Test5_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Scanner inputStr=new Scanner(System.in);
		System.out.println("����ѧ��������");
		int student=input.nextInt();
		String name="";
		int score=0;
		String ss="";
		String maxName="";
		int maxScore=0;
		for(int i=0;i<student;i++){
			System.out.println("������ѧ������");
			name=inputStr.nextLine();
			System.out.println("������ѧ������");
			score=input.nextInt();
			if(score>maxScore){
				maxName=name;
				maxScore=score;
			}
			ss+=name+"\t"+score+"\n";
		}
		System.out.println(ss);
		System.out.print(maxName+"\t"+maxScore);
	}

}
