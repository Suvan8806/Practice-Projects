package JavaLinkedList;

import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList() {
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums) {
		list = new LinkedList<Integer>();
		for (int n : nums) {
			list.add(n);
		}
	}

	public double getSum() {
		double total=0;
		for (int n: list) {
			total += n;
		}
		return total;
	}

	public double getAvg(  ) {
		return getSum() / list.size();
	}

	public int getLargest() {
		int largest = list.get(0);
		for (int n : list) {
			if (largest < n) {
				largest = n;
			}
		}
		return largest;
	}

	public int getSmallest() {
		int smallest = list.get(0);
		for (int n : list) {
			if (smallest > n) {
				smallest = n;
			}
		}
		return smallest;
	}

	public String toString() {
		return "Sum:: " + getSum() + " \nAVERAGE:: "+ getAvg() + " \nSMALLEST:: " + getSmallest() + " \nLARGEST:: " + getLargest() + "\n";
	}
}
