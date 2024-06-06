package IteratorLab2;
import java.util.ArrayList;

import java.util.Arrays;

import java.util.ListIterator;

import static java.lang.System.*;

public class IteratorReplacerRunner {
	
	public static void main ( String[] args ) {
 	   
 	   String[] wordBank = {"a b c a b c     a    +", "a b c d e f g h i j x x x x     x    7", "1 2 3 4 5 6 a b c a b c     b    #"};
 	   
 	   for (int i = 0; i < wordBank.length; i++) {
 		  String[] words = wordBank[i].split(" ");
 		  
 		  IteratorReplacer ok = new IteratorReplacer(wordBank[i], words[words.length-5], words[words.length-1]);
     	  System.out.println(ok);
     	   
 	   }
    }
	
}
