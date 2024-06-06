package MapLab2;

import java.io.File;
import java.io.IOException;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;
public class Acronyms {
       private Map<String,String> acronymTable;
       public Acronyms() {
    	   acronymTable = new TreeMap<String,String>();
    	   acronymTable.put("TSO", "Texas State Optical");
    	   acronymTable.put("PDA", "Personal Display of Affection");
    	   acronymTable.put("RBA", "Runs Batted In");
    	   acronymTable.put("SO", "Strike Out");
    	   acronymTable.put("FG", "Field Goal");
    	   acronymTable.put("CPU", "Central Processing Unit");
    	   acronymTable.put("HD", "Hard Drive");
    	   acronymTable.put("PU", "Pick up");
    	   acronymTable.put("TSO.", "Texas State Optical.");
    	   acronymTable.put("PDA.", "Personal Display of Affection.");
    	   acronymTable.put("RBA.", "Runs Batted In.");
    	   acronymTable.put("SO.", "Strike Out.");
    	   acronymTable.put("FG.", "Field Goal.");
    	   acronymTable.put("CPU.", "Central Processing Unit.");
    	   acronymTable.put("HD.", "Hard Drive.");
    	   acronymTable.put("PU.", "Pick up.");
       }

       public String convert(String sent) {
              if (acronymTable.containsKey(sent)) {
            	  //System.out.println("sent");
            	  return acronymTable.get(sent);
              }
              return sent;

       }

       public String toString() {
    	   	  String output = "====    MAP CONTENTS    ==== ";
    	   	  for(String c : acronymTable.keySet()) {
    	   		output += c + " = " + acronymTable.get(c) + "\n";
    	   	  }
              return output;

       }

}