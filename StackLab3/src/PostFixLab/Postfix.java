package PostFixLab;

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class Postfix
{
	private Stack<Double> nums;
	private String expression;
	public double total;


	public Postfix(String exp) {
		expression = exp;
		Stack<Double> nums = new Stack();
		total = setExpression(expression);
	}

	public double setExpression(String exp) {
		Stack<Double> nums = new Stack();
		
		String[] list = exp.split(" ");
		for(String a : list) {
			if(a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/")) {
				nums.push(calc(nums.pop(), nums.pop(), a));
			} else {
				nums.push(Double.valueOf(a));
			}
			
		}
		return nums.pop();
	}

	public double calc(double two, double one, String op) {
		if (op.equals("+")) {
			return one + two;
		} else if (op.equals("-")) {
			return one - two;
		} else if (op.equals("*")) {
			return one * two;
		} else if (op.equals("/")) {
			return one / two;
		}
			
		return 0.0;
	}


	public String toString() {
		return expression + " = " + total;
	}
}

