package chapter.five.test;

public class Test5_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i1=1;i1<=6;i1++){
			for(int j1=1;j1<=i1;j1++){
				System.out.print(" ");
				System.out.print(j1);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=6;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=6;i++){
			for(int j=6;j>=i;j--){
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--){
				System.out.print(" ");
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1,l=6;i<=6;i++,l--){
			for(int j=1;j<=6;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("  ");
			}
			for(int k=1;k<=l;k++){
				System.out.print(" ");
				System.out.print(k);
			}
			System.out.println();
		}
		
	}

}
