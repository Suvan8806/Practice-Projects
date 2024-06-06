package AutoPartsMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.*;

public class PartList {
    private TreeMap<Part, Integer> partsMap;
    
    public PartList() {
        partsMap = new TreeMap<>();
    }
    
    public PartList(String fileName) throws IOException {
        partsMap = new TreeMap<>();
        Scanner kb = new Scanner(new File(fileName));
        int i = 0;
        while (i<8) {
        	i++;
            String name = "";
            while(!kb.hasNextInt()) {
				name+= kb.next() + " ";
			}
            int partNumber = Integer.parseInt(kb.next());
            String make = kb.next();
            String model = kb.next();
            int year = Integer.parseInt(kb.next());
            Part part = new Part(name, partNumber, make, model, year);
            partsMap.put(part, partsMap.getOrDefault(part, 0) + 1);
        }
    }
    

    public String toString() {
        String output = "";
        for (Map.Entry<Part, Integer> entry : partsMap.entrySet()) {
            Part part = entry.getKey();
            int count = entry.getValue();
            output += part.toString() + " - " + count + "\n"; 
        }
        return output.toString();
    }
}
