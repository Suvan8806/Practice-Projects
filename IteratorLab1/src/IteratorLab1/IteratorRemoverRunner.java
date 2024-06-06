package IteratorLab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import BlackJack.Dealer;

import static java.lang.System.*;



public class IteratorRemoverRunner {
	
	
       public static void main ( String[] args ) {
    	   
    	   String[] wordBank = {"a b c a b c a     a", "a b c d e f g h i j x x x x     x", "1 2 3 4 5 6 a b c a b c     b"};
    	   
    	   for (int i = 0; i < wordBank.length; i++) {
    		   
        	   IteratorRemover ok = new IteratorRemover(wordBank[i]);
        	   System.out.println(ok);
        	   
    	   }
       }
}