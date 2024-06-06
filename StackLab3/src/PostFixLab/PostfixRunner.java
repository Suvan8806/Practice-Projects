package PostFixLab;

public class PostfixRunner {
	public static void main(String [] args) {
		Postfix wow = new Postfix("1 2 3 4 + + +");
		System.out.println(wow);
		
		Postfix wow2 = new Postfix("9 3 * 8 / 4 +");
		System.out.println(wow2);
		
		Postfix wow3 = new Postfix("5 5 + 2 * 4 / 9 +");
		System.out.println(wow3);
	}
}
