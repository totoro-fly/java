package chapter.six.test;

public class Test6_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toDetectThePassword("jfdsfsd33a");
	}

	public static void toDetectThePassword(String str) {
		int NUMBER_OF_TWO=2;
		if (str.length() >= 8) {
			for (int i = 0; i < str.length(); i++) {
				if ((str.charAt(i) >= '0' && str.charAt(i) <= '9') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
						|| (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				}else{
					System.out.println("Invalid Password");
					return;
				}
			}
		} else{
			System.out.println("Invalid Password");
			return;
		}
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
				NUMBER_OF_TWO--;
			}
		}
		if(NUMBER_OF_TWO<=0)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Pasword");
			
	}
}
