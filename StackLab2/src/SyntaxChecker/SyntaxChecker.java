package SyntaxChecker;


import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker {
	private String exp;
	private String egg;
	private Stack<String> symbols;
	boolean wow;



	public SyntaxChecker(String s) {
		exp = s;
		egg = s;
		Stack symbols = new Stack();
		boolean wow = false;
		setExpression(exp);
	}
	
	public void setExpression(String s) {
		Stack symbols = new Stack();
		int len = s.length();
		String temp = "";
		int c = 0;
		
		while(!exp.isEmpty()) {
			if(c == len) {
				temp = exp.substring(len);
				exp = "";
			} else {
				temp = exp.substring(c,c+1);
				c++;
			}

			//System.out.println(temp);
			if(temp.equals("{") || temp.equals("[") || temp.equals("(") || temp.equals("<")) {
				symbols.add(temp);
				
			} else if (temp.equals("}") || temp.equals("]") || temp.equals(")") || temp.equals(">")) {
				
				if (!symbols.isEmpty()) {
					
					
					if(temp.equals("}")) {
						if("{".equals(symbols.pop())) {
							wow = true;
						} else {
							wow = false;
							exp = "";
						}
					} else if(temp.equals("]")) {
						if("[".equals(symbols.pop())) {
							wow = true;
						} else {
							wow = false;
							exp = "";
						}
					} else if(temp.equals(")")) {
						
						if("(".equals(symbols.pop())) {
							wow = true;
						} else {
							wow = false;
							exp = "";
						}
					} else if(temp.equals(">")) {
						if("<".equals(symbols.pop())) {
							wow = true;
						} else {
							wow = false;
							exp = "";
						}
					} 
					
					
					} else {
						wow = false;
						exp = "";
					}
					
		
			}
		}
	}

	public String checkExpression(boolean wow) {
		if (wow) {
			return " is correct.";
		}
		return " is incorrect.";
	}

	public String toString() {
		return egg + " " + checkExpression(wow);
	}
}

