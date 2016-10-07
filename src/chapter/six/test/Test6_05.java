package chapter.six.test;

public class Test6_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(displaySortedNumbers(5, 43, 9));
	}

	public static String displaySortedNumbers(double n1, double n2, double n3) {
		String str="";
		if(n1>n2){
			double tem=n1;
			n1=n2;
			n2=tem;
		}
		if(n1>n3){
			double tem=n1;
			n1=n3;
			n3=tem;
		}
		if(n2>n3){
			double tem=n2;
			n2=n3;
			n3=tem;
		}
		return str=n1+" "+n2+" "+n3;
	}
	

}
