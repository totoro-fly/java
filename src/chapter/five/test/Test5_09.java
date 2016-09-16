package chapter.five.test;

import java.util.Scanner;

public class Test5_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		System.out.println("输入学生总人数");
		int student = input.nextInt();
		String name = "";
		int score = 0;
		String ss = "";
		String maxName = "";
		String maxName2 = "";
		int maxScore = 0;
		int maxScore2 = 0;
		for (int i = 0; i < student; i++) {
			System.out.println("请输入学生名称");
			name = inputStr.nextLine();
			System.out.println("请输入学生分数");
			score = input.nextInt();
			if (score > maxScore ) {
				maxName2=maxName;
				maxScore2=maxScore;
				maxName = name;
				maxScore = score;
			}
			if (score < maxScore&&score>maxScore2) {
				maxName2 = name;
				maxScore2 = score;
			}
			ss += name + "\t" + score + "\n";
		}
		System.out.println(ss);
		System.out.println(maxName + "\t" + maxScore);
		if(maxScore2!=0)
		System.out.println(maxName2 + "\t" + maxScore2);
	}

}
