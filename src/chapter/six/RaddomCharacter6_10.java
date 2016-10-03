package chapter.six;

public class RaddomCharacter6_10 {

	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + (Math.random() * (ch2 - ch1 + 1)));
	}

	public static char getRandomLowerCaseLeter() {
		return getRandomCharacter('a', 'z');
	}

	public static char getRandomUpperCaseLeter() {
		return getRandomCharacter('A', 'Z');
	}

	public static char getRandomCharater() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}

}
