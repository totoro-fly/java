package chapter.four.test;

public class Test4_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		for(int i=0;i<3;i++){
			char ch=(char)((int)'A'+(int)(Math.random()*26));
			str+=ch;
		}
		for(int i=0;i<4;i++){
			int j=(int)(Math.random()*10);
			str+=j;
		}
		System.out.println(str);
	}

}
