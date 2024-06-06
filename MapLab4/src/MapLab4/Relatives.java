package MapLab4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives {
	private Map<String,Set<String>> map;

	public Relatives() {
		map = new TreeMap<String,Set<String>>();
	}

	public void setPersonRelative(String line) {
		String[] personRelative = line.split(" ");
		Set<String> one = new TreeSet<String>();
		if(map.containsKey(personRelative[0])) {
			Set<String> two = new TreeSet<String>();
			two.addAll(map.get(personRelative[0]));
			two.add(personRelative[1]);
			map.put(personRelative[0], two);
		} else {
			one.add(personRelative[1]);
			map.put(personRelative[0], one);
		}
	}


	public String getRelatives(String person)	{
		Set<String> rels = new TreeSet<String>();
		rels.addAll(map.get(person));
		String output = "";
		for (String s : rels) {
			output += s + " ";
		}
		return output;
	}

	public String toString() {
		String output="";
		Set<String> keys = new TreeSet<String>();
		keys.addAll(map.keySet());
		for(String s : keys) {
			output += s + " is related to " + getRelatives(s) + "\n";
		}
		output += "\nDot is related to " + map.get("Dot");
		
		return output;
	}
}
