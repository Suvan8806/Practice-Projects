package SetLab2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
		//more test cases
		Scanner kb = new Scanner(new File("C:\\Users\\suvan\\Desktop\\CS3 labs\\SetLab2\\src\\SetLab2\\oddeven.dat"));
		
		while(kb.hasNext()) {
			OddEvenSets test = new OddEvenSets(kb.nextLine());
			System.out.println(test);
		}
				
	}
}
