package IteratorLab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover {
       private ArrayList list;
       private String toRemove;
       private Iterator<String> it;

       public IteratorRemover(String line) {
    	   String[] words = line.split(" ");
    	   list = new ArrayList(Arrays.asList(words));
    	   toRemove = words[words.length-1];
    	   it = list.iterator();
    	   remove();
       }
       
       public void remove() {
    	   while(it.hasNext()) {
    		   if(it.next().equals(toRemove)) {
    			   it.remove();
    		   }
    	   }
       }
       
       public String toString() {
              return "" + list;
       }

}