package chapter.six.test;

public class Test6_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ó¢³ß\tÃ×\t\tÃ×\tÓ¢³ß\n");
		System.out.print("-------------------------------------\n");
		for(double i=1,j=20;i<=10;i++,j=j+5){
			System.out.printf("%.1f\t%.3f\t\t",i,footToMeter(i));
			System.out.printf("%.1f\t%.3f\n",j,meterToFoot(j));
		}
	}
	public static double footToMeter(double foot){
		return 0.305*foot;
	}
	public static double meterToFoot(double meter){
		return 3.279*meter;
	}
	

}
