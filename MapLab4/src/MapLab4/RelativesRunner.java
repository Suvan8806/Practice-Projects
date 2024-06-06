package MapLab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class RelativesRunner {
	public static void main( String args[] ) throws IOException {
		//add test cases	
		Scanner kb = new Scanner(new File("C:\\Users\\suvan\\Desktop\\CS3 labs\\MapLab4\\src\\MapLab4\\relatives.dat"));
		int count = kb.nextInt();
		Relatives test = new Relatives();
		kb.nextLine();
		for(int i = 0; i < count; i++) {
			//System.out.println(kb.nextLine());
			test.setPersonRelative(kb.nextLine());
		}
		
		System.out.println(test);
	}
}