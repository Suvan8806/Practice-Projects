package QueueLab1;

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
 

public class PalinList {

      private Queue<String> queue;
      private Stack<String> stack;
      private String[] words;

      public PalinList(String list) {
    	  stack = new Stack<String>();
    	  queue = new LinkedList<String>();
    	  setList(list);
      }

      public void setList(String list) {
    	  words = list.split(" ");
    	  for(String a : words) {
    		  stack.push(a);
    		  queue.add(a);
    	  }
      }

      public boolean isPalin() {
    	  while (!stack.isEmpty() || !queue.isEmpty()) {
    		  if (!stack.pop().equals(queue.remove())) {
    			  return false;
    		  }
    	  }
            return true;
      }

      public String toString() {
  		  if (isPalin()) {
  			  return Arrays.toString(words) + " is a palinList.";
  		  }
  		  return Arrays.toString(words) + " is not a palinList.";
  	}
      
      
}