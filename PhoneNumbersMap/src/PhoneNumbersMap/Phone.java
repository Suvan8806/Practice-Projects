package PhoneNumbersMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;

public class Phone {
	private Map<String,Integer> map;
	
	public Phone() {
		map = new TreeMap<String,Integer>();
	}
	
	public void setNums(String lets, int n) {
		if(lets.equals("None")) {
			map.put("None", n);
		} else {
			String ok[] = lets.split("");
			for(String s : ok) {
				map.put(s, n);
			}	
		}
	}
	
	public String getNumber(String nums) {
		Scanner kb = new Scanner(System.in);
		String output = "";

		String ok[] = nums.split("");
		for(String s : ok) {
			
			if(map.get(s) != null) {
				output += map.get(s);
			} else {
				output += s;
			}
		}
		
		
		return output;
	}
}
