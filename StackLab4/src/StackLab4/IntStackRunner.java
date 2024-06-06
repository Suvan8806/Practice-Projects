package StackLab4;

import java.util.Arrays;

public class IntStackRunner {
	public static void main(String [] args) {
		int test[] = {25, 30, 35, 23};
		
		IntStack wow = new IntStack(test);
		System.out.println(wow);
		wow.push(242);
		System.out.println(wow);
		System.out.println(wow.pop());
		System.out.println(wow.pop());
		System.out.println(wow.pop());
		System.out.println(wow.pop());
		System.out.println(wow);
		System.out.println(wow.isEmpty());
		System.out.println(wow.pop());
		System.out.println(wow);
	}
}
