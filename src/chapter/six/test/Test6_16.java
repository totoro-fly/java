package chapter.six.test;

public class Test6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2000;i<=2020;i++){
			System.out.println(i+" "+numberOfDaysInAYear(i));
		}
	}
	public static int numberOfDaysInAYear(int year){
		if(isLeapYear(year)){
			return 366;
		}else
			return 365;
	}
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? true : false;
	}

}
