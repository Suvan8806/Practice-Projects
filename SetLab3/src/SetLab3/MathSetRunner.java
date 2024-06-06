package SetLab3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class MathSetRunner {
	public static void main(String args[]) throws IOException {
		//add test cases
		Scanner kb = new Scanner(new File("C:\\Users\\suvan\\Desktop\\CS3 labs\\SetLab3\\src\\SetLab3\\mathsetdata.dat"));
		
		while(kb.hasNext()) {
			MathSet test = new MathSet(kb.nextLine() , kb.nextLine());
			System.out.println(test);
		}
	}
}
