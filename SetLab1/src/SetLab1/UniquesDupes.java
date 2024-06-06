package SetLab1;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import static java.lang.System.*;


public class UniquesDupes {
	
	private String data;
	private static Set<String> uniques = new HashSet();
	private static Set<String> dupes = new HashSet();	
	public UniquesDupes(String s) {
		data = s;
		String[] words = data.split(" ");
		getUniques(words);
		getDupes(s);
	}
	
	public static Set<String> getUniques(String[] input) {
		//add code
		boolean check = true;
		for (String s : input) {
			check = uniques.add(s);
			if(check) {
				//System.out.println(uniques);
			} else if(!check){
				dupes.add(s);
			}
		}
		return uniques;
	}

	public static Set<String> getDupes(String input) {
		return dupes;
	}
	public void clear() {
		dupes.clear();
		uniques.clear();
	}
	
	public String toString(){

		return "Original List : " + data + "Uniques : " + uniques + "Dupes: " + dupes ;
  }
}
