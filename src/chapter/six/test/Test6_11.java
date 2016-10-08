package chapter.six.test;

public class Test6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("销售总额\t\t酬金\n");
		System.out.print("----------------------\n");
		for(int i=10000;i<=100000;i=i+5000){
			System.out.print(i+"\t\t"+computeCommission(i)+"\n");
		}
		
	}
	public static double computeCommission(double salesAmount){
		if(salesAmount>0.01&&salesAmount<5000){
			return salesAmount*0.08;
		}else if(salesAmount>5000.01&&salesAmount<10000){
			return 5000*0.08+(salesAmount-5000)*0.1;
		}else
			return 5000*0.08+5000*0.1+(salesAmount-10000)*0.12;
	}

}
