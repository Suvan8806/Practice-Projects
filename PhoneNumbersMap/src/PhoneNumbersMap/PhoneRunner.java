package PhoneNumbersMap;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PhoneRunner {
	public static void main( String args[] ) throws IOException {
		Phone w = new Phone();
		Scanner kb = new Scanner(new File("C:\\Users\\suvan\\Desktop\\CS3 labs\\PhoneNumbersMap\\src\\PhoneNumbersMap\\data.dat"));
		while(kb.hasNext()) {
			w.setNums(kb.next(), kb.nextInt());
		}
		
		System.out.println( w.getNumber( "800-BIG-DOGS" ) ); // 800-244-3647
		System.out.println( w.getNumber( "333-ATS-TORE" ) ); // 333-287-8673
		System.out.println( w.getNumber( "777-GOK-ARTS" ) ); // 777-465-2787
	}
}
