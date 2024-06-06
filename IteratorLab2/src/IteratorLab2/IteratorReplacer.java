package IteratorLab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacer {

      private ArrayList list;
      private String toRemove, replaceWith;
      private ListIterator<String> it;

      public IteratorReplacer(String line, String rem, String rep) {
    	  String[] words = line.split(" ");
   	   	  list = new ArrayList(Arrays.asList(words));
   	   	  toRemove = rem;
   	   	  replaceWith = rep;
   	   	  it = list.listIterator();
   	   	  setEmAll();
      }

      public void setEmAll() {
    	  while(it.hasNext()) {
   		   	if(it.next().equals(toRemove)) {
   			   it.set(replaceWith);
   		   	} else if (it.next().equals("")){
   		   		it.remove();
   		   	}
   	   	  }
    	  
      }

      public void replace() {
    	  
      }
      
      public String toString(){
            return list.toString()+"\n\n";
      }

}