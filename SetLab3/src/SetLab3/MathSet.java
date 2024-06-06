package SetLab3;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;

import static java.lang.System.*;

public class MathSet {
	private Set<Integer> one = new TreeSet();
	private Set<Integer> two = new TreeSet();

	public MathSet() {
	}

	public MathSet(String o, String t) {
		
		String[] oneList = o.split(" ");  
		for(String s : oneList) {
			one.add(Integer.parseInt(s));
		}
		String[] twoList = t.split(" ");  
		for(String s : twoList) {
			two.add(Integer.parseInt(s));
		}
	}

	public Set<Integer> union() {
		Set<Integer> temp = new TreeSet();
		//temp = one;
		temp.addAll(two);
		return temp;
	}

	public Set<Integer> intersection() {
		Set<Integer> temp = new TreeSet();
		temp.addAll(one);
		temp.retainAll(two);
		return temp;
	}

	public Set<Integer> differenceAMinusB() {
		Set<Integer> temp = new TreeSet();
		temp.addAll(one);
		temp.removeAll(two);
		return temp;
	}

	public Set<Integer> differenceBMinusA() {
		Set<Integer> temp = new TreeSet();
		temp.addAll(two);
		temp.removeAll(one);
		return temp;
	}
	
	public Set<Integer> symmetricDifference() {	
		Set<Integer> temp = new TreeSet();
		temp.addAll(differenceAMinusB());
		temp.addAll(differenceBMinusA());
		return temp;
	}	
	
	public String toString() {
		return "Set one " + one + "\n" +	"Set two " + two +  "\n\n" + "union - " + union() + "\n" +	"intersection - " + intersection() 
		+  "\n" + "difference A-B - " + differenceAMinusB() + "\n" + "difference B-A - " + differenceBMinusA() 
		+  "\n" + "symmetric difference - " + symmetricDifference() + "\n";
	}
}
