package chapter.five;

public class Test5_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=10;
		while(true){
			if(balance<9)
				break;
			balance=balance-9;
		}
		System.out.println("Balance is "+balance);

		int balance2=10;
		while(true){
			if(balance2<9)
				continue;
			balance2=balance2-9;
			System.out.println("Balance is "+balance2);
		}
	}

}
