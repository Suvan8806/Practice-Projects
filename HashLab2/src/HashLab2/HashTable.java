package HashLab2;

import java.util.LinkedList;

public class HashTable {
	
	private LinkedList<Word>[] table;
	public HashTable() {
		table = new LinkedList[10];
		for (int i = 0; i < table.length; i++) {
			table[i] = new LinkedList<>();
		}
	}
	
	public void add(String value) {
		Word w = new Word(value);
		int hashIndex = w.hashCode();
		if (!contains(table[hashIndex], value)) {
			table[hashIndex].add(w);
		}
	}
	
	private boolean contains(LinkedList<Word> list, String value) {
		for (Word word : list) {
			if (word.getValue().equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	// ToString
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("HASHTABLE\n");
		for (int i = 0; i < table.length; i++) {
			output.append("bucket ").append(i).append(" ");
			for (Word word : table[i]) {
				output.append(word).append(" ");
			}
			output.append("\n");
		}
		return output.toString();
	}
}