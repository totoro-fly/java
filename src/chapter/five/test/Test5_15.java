package chapter.five.test;

public class Test5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=(int)'!',j=1;;i++,j++){
			System.out.print((char)i+" ");
			if(j%10==0)
				System.out.println();
			if(i==(int)'~')
				break;
		}
	}

}
