package MapLab3;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;

public class SpanishToEnglish {
       private Map<String,String> pairs;

       public SpanishToEnglish() {
    	   pairs = new TreeMap<String,String>();
       }

       public void putEntry(String entry) {
    	   	  //System.out.println(entry);
              String[] list = entry.split(" ");
              //System.out.println(list.length);
              pairs.put(list[0], list[1]);
       }

       public String translate(String sent) {
    	   String[] words = sent.split(" ");
    	   String output = "";
    	   for (int i = 0; i < words.length; i ++) {
    		   if (pairs.containsKey(words[i])) {
    	         	  //System.out.println("sent");
    	         	  output += pairs.get(words[i]) + " ";
    	       } else {
    	    	   output += words[i];
    	       }
    	   }
              return output;
       }

       public String toString() {
              return pairs.toString().replaceAll("\\,","\n");
       }

}