package MapLab3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner {

    public static void main( String args[] ) throws IOException {
    	Scanner kb = new Scanner(new File("C:\\Users\\suvan\\Desktop\\CS3 labs\\MapLab3\\src\\MapLab3\\spantoeng.dat"));
        SpanishToEnglish test = new SpanishToEnglish();
        
        int count = kb.nextInt();
        kb.nextLine();
        for (int i = 0; i < count; i++) {
        	test.putEntry(kb.nextLine());
        }
        
        System.out.println("====    MAP CONTENTS    ====");
        System.out.println(test);
        while(kb.hasNext()) {
        	System.out.println(test.translate(kb.nextLine()));
        }
        
    }
    
}