package SyntaxChecker;

public class SyntaxCheckerRunner {
	public static void main(String [] args) {
		SyntaxChecker wow = new SyntaxChecker("car(cdr(a)(b)))");
		System.out.println(wow);
		
		SyntaxChecker wow2 = new SyntaxChecker("{<html[value=4]*(12)>{$x}}");
		System.out.println(wow2);
		
	}
}
