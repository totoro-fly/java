package chapter.three.test;

public class Test3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 1 + (int) (Math.random() * 13);
		int number2 = 1 + (int) (Math.random() * 4);
		String number1S=exchangeNumber1(number1);
		String number2S=exchangeNumber2(number2);
		System.out.println("The card you picked is "+number1S+" of "+number2S);
	}

	static String exchangeNumber1(int number) {
		switch (number) {
		case 1:
			return "Ace";
		case 2:
			return "2";
		case 3:
			return "3";
		case 4:
			return "4";
		case 5:
			return "5";
		case 6:
			return "6";
		case 7:
			return "7";
		case 8:
			return "8";
		case 9:
			return "9";
		case 10:
			return "10";
		case 11:
			return "Jack";
		case 12:
			return "Queen";
		case 13:
			return "King";
		}
		return null;
	}

	static String exchangeNumber2(int number) {
		switch(number){
		case 1:
			return "Clubs";
		case 2:
			return "Diamonds";
		case 3:
			return "Hearts";
		case 4:
			return "Spades";
		}
		return null;
	}
}
