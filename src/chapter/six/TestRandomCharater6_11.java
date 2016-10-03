package chapter.six;

public class TestRandomCharater6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_OF_CHAR = 175;
		final int CHARS_PER_LINE = 25;
		for (int i = 1; i <= NUMBER_OF_CHAR; i++) {
			if (i % CHARS_PER_LINE == 0) {
				System.out.println(RaddomCharacter6_10.getRandomLowerCaseLeter());
			} else
				System.out.print(RaddomCharacter6_10.getRandomLowerCaseLeter());

		}
	}

}
