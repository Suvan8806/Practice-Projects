package MapLab2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class AcroRunner {
       public static void main( String args[] ) throws IOException {
              //add test cases
    	   String test = "I drove my PU to TSO to get a HD.  My CPU has a virus.  I sometimes SO when trying to kick a FG.  I had 2 RBI at the game.  I saw 2 PDA infractions in the hall. ";
    	  
    	   Acronyms ok = new Acronyms();
    	   String[] words = test.split(" ");
    	   int count = 0;
    	   for (String s : words) {
    		   words[count] = ok.convert(s);
    		   count++;
    	   }
    	   
    	   System.out.println(ok);
    	   
    	   System.out.println("====    READ LINES      ====");
    	   for (String s : words) {
    		   System.out.print(s + " ");
    	   }
    	   
    	   
    	   

       }
}