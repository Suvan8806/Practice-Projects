package PQTest;

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTest {

       private Queue pQueue;
       private String[] words;

       public PQTest(String list) {
    	   pQueue = new PriorityQueue<Object>();
    	   setPQ(list);
       }

       public void setPQ(String list) {
    	   words = list.split(" ");
    	   for (String a : words) {
    		   pQueue.add(a);
    	   }
       }

       public Object getMin() {
    	   return pQueue.peek();
       }

       public String getNaturalOrder() { 
    	   String output="";
    	   while(!pQueue.isEmpty()) {
    		   output+= pQueue.remove() + " ";
    	   }
    	   return output;       
       }

       public String toString() { 
   		  if (true) {
   		  }
   		  return pQueue.toString();
   	}

}