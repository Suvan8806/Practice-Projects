package StackBasics;

import java.util.Stack;
import static java.lang.System.*;

public class StackTest {
	private Stack<String> stack;

	public StackTest(String set){
		stack = new Stack();
		setStack(set);
		
	}
	
	public void setStack(String set) {
		String[] arrOfStr = set.split(" ");
		
		for (String a : arrOfStr) {
            stack.add(a);
		}
	}


	public void popEmAll() {
		int a = stack.size();
		for(int i = 0; i < a; i++) {
			System.out.print(stack.pop() + " ");
		}
	}

	//add a toString
	public String toString() {
		popEmAll();
		return "";
	}
}

