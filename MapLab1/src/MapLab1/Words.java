package MapLab1;
import java.util.*;

public class Words {
      private Map<String,Integer> map;
    
      public Words() {
            //create a new map
    	  map = new TreeMap<String,Integer>();
            //load in values   
    	  map.put("one", 1);
    	  map.put("two", 2);
    	  map.put("three", 3);
    	  map.put("four", 4);
    	  map.put("five", 5);
    	  map.put("six", 6);
    	  map.put("seven", 7);
    	  map.put("eight", 8);
    	  map.put("nine", 9);
    	  map.put("ten", 10);
      }
    
      public int getNumber( String s ) {
            return map.get(s);   //change this
      }
}