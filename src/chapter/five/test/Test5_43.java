package chapter.five.test;

public class Test5_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				if(i==j)
					continue;
				System.out.println(i+""+j);
				count++;
			}
		}
		System.out.println(count);
	}

}
