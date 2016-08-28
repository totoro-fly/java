package chapter.four.test;

import java.util.Scanner;

public class Test4_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputStr = new Scanner(System.in);
		System.out.println("Enter the first city:");
		String city1 = inputStr.nextLine();
		System.out.println("Enter the second city:");
		String city2 = inputStr.nextLine();
		System.out.println("Enter the third city:");
		String city3 = inputStr.nextLine();
		String city = "";
		if (city1.compareTo(city2) > 0) {
			city = city1;
			city1 = city2;
			city2 = city;
		}
		if (city1.compareTo(city3) > 0) {
			city = city1;
			city1 = city3;
			city3 = city;
		}
		if (city2.compareTo(city3) > 0) {
			city = city2;
			city2 = city3;
			city3 = city;
		}
		System.out.println("The three cities in alphabet order are " + city1 + " " + city2 + " " + city3);

	}

}
