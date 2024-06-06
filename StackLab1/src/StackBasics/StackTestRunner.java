package StackBasics;

public class StackTestRunner {
	public static void main(String [] args) {
		StackTest wow = new StackTest("a b c d e f g h i");
		StackTest wow2 = new StackTest("1 2 3 4 5 6 7 8 9 10");
		StackTest wow3 = new StackTest("# $ % ^ * ( ) ) _");
		wow.toString();
		System.out.println();
		wow2.toString();
		System.out.println();
		wow3.toString();
	}
}
