package SetLab2;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds = new HashSet();
	private Set<Integer> evens = new HashSet();
	

	public OddEvenSets() {
	}

	public OddEvenSets(String line) {
		String[] nums = line.split(" ");   
		for(String s : nums) {
			if( Integer.parseInt(s) % 2 == 0 ) {
				evens.add(Integer.parseInt(s));
			} else {
				odds.add(Integer.parseInt(s));
			}
		}
		
		
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}
