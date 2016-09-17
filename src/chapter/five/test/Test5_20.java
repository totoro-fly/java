package chapter.five.test;

public class Test5_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int number = 2;
		int i = 2;
		while (number <= 1000) {
			while (i<number) {
				if (number % i == 0 ) {
					number++;
					if(number>=1000)
						break;
					i=2;
				} else {
					i++;
				}
			}
			if(number>=1000)
				break;
			System.out.print(number + " ");
			number++;
			i = 2;
			count++;
			if (count % 8 == 0)
				System.out.println();
		}
	}

}
