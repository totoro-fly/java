package chapter.five.test;

public class Test5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1,j=1;i<=8;i++,j=j*2){
			for(int l=8;l>=i;l--){
				System.out.print("     ");
			}
			for(int k=1;k<=j;k=k*2){
				System.out.print("  ");
				System.out.printf("%3d",k);
			}
			for(int k=j/2;k>=1;k=k/2){
				System.out.print("  ");
				System.out.printf("%3d",k);
			}
			System.out.println();
		}
	}

}
