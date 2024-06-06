package HashTableLab1;

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable {
	private ListNode[] table;

	public HashTable() {
		table = new ListNode[10];
	}
	
	public void add(Object obj) {
		//System.out.println("adsdfd");
		if(obj instanceof Number) {
			Number n = (Number) obj;
			int i = n.hashCode() % table.length;
			if(table[i] == null) {
				//System.out.println("");
				table[i] = new ListNode(n, null);
			} else {
				ListNode current = table[i];
		
				while(current.getNext()!= null) {
					current = current.getNext();
				}
				current.setNext(new ListNode(n, null));
			}
		}
	}
	

	public String toString() {
		StringBuilder output = new StringBuilder("HASHTABLE\n");
		for(int i = 0; i < table.length; i++) {
			output.append("bucket").append(i).append(" ");
			ListNode cc = table[i];
			while(cc != null) {
				output.append(cc.getData().getValue()).append(" ");
				cc = cc.getNext();
			}
			output.append("\n");
		}
		return output.toString();
	}
}
