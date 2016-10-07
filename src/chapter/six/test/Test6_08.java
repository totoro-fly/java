package chapter.six.test;

public class Test6_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("摄氏度\t华氏度\t\t摄氏度\t华氏度\n");
		System.out.print("-------------------------------------\n");
		for(double i=40,j=120;i>30;i--,j=j-10){
			System.out.printf("%.1f\t%.1f\t\t",i,celsiusToFahrenheit(i));
			System.out.printf("%.1f\t%.1f\n",j,fahrenheitToCelsius(j));
		}
	}
	public static double celsiusToFahrenheit(double celsius){
		return (9.0/5)*celsius+32;
	}
	public static double fahrenheitToCelsius(double fahrenheit){
		return (5.0/9)*(fahrenheit-32);
	}
}
