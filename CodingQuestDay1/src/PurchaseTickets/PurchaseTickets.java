package PurchaseTickets;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import AutoPartsMap.Part;

public class PurchaseTickets {
	private TreeMap<String, Integer> Spaceliners;
	public PurchaseTickets() {
		
	}
	public PurchaseTickets(String file) throws IOException {
		Spaceliners = new TreeMap<>();
		Scanner kb = new Scanner(new File(file));
		while(kb.hasNextLine()) {
			String line[] = kb.nextLine().split(" ");
			
			if(line[1].equals("Seat") || line[1].equals("Meals") || line[1].equals("Luggage") || line[1].equals("Fee") || line[1].equals("Tax")) {
				Spaceliners.put(line[0], Spaceliners.getOrDefault(line[0], 0) + Integer.parseInt(line[2]));
			} else {
				Spaceliners.put(line[0], Spaceliners.getOrDefault(line[0], 0) - Integer.parseInt(line[2]));
			}
		}
	}
	
	public String getCheapest() {
		Collection<Integer> costs = Spaceliners.values();
		int minValue = Collections.min(costs);
		String minName = "";
		for (Entry<String, Integer> entry : Spaceliners.entrySet()) {
	        if (entry.getValue().equals(minValue)) {
	            minName = entry.getKey();
	        }
	    }
		return minName + " " + minValue;
	}
	
	public String toString() {
        String output = "";
        for (Map.Entry<String, Integer> entry : Spaceliners.entrySet()) {
            String name = entry.getKey();
            int cost = entry.getValue();
            output += name + " : " + cost + "\n"; 
        }
        return output.toString();
    }
}
