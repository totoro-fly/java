package chapter.five.test;

import java.util.Scanner;

public class Test5_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数(大于2)");
		int number = input.nextInt();
		int i = 2;
		int[] a = new int[100];
		int j = 0;
		while (true) {
			while (i != number) {
				if (number % i == 0) {
					break;
				} else
					i++;
			}
			if (number != i) {
				number = number / i;
				a[j] = i;
				i = 2;
				j++;
			} else {
				a[j] = i;
				break;
			}
		}
		for (int k = 0; k < a.length; k++) {
			if (a[k] == 0)
				break;
			System.out.println(a[k]);
		}

	}

}
