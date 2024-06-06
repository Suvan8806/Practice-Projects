package SetLab1;

import static java.lang.System.*;
import java.util.*;

public class DupRunner {
	public static void main( String args[] ) {
		String[] data = {"a b c d e f g h a b c d e f g h i j k\r\n" ,"one two three one two three six seven one two\r\n" ,"1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6\r\n"};
		
		for (String s : data) {
			UniquesDupes test = new UniquesDupes(s);
			System.out.println(test + "\n");
			test.clear();
		}
 	}
}
