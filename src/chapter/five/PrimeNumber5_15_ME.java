package chapter.five;

public class PrimeNumber5_15_ME {
//想了4个小时。。。。。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		int number = 2;
		int i = 2;
		while (count <= 50) {
			while (i <=number/2) {
				if(number%i==0){
					number++;
					i=2;
				}
				else
					i++;
			}
			System.out.print(number + "\t");
			if (count % 5 == 0)
				System.out.println();
			number++;
			count++;
			i=2;
		}
	}

}
