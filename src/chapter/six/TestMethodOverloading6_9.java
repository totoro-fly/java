package chapter.six;

public class TestMethodOverloading6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The max of 3 and 4 is "+max(3,4));
		System.out.println("The max of 3.0 and 5.4 is "+max(3.0,5.4));
		System.out.println("The max of 3.0 and 5.4 and 10.14 is "+max(3.0,5.4,10.14));
	}
	public static int max(int n1,int n2){
		if(n1>n2){
			return n1;
		}else
			return n2;
	}
	public static double max(double n1,double n2){
		if(n1>n2){
			return n1;
		}else
			return n2;
	}
	public static double max(double n1,double n2,double n3){
//		if(n1>n2){
//			if(n1>n3)
//				return n1;
//			else 
//				return n3;
//		}else{
//			if(n2>n3)
//				return n2;
//			else 
//				return n3;
//		}
		return max(max(n1,n2),n3);
			
	}
}
