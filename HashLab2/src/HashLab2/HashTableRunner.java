package HashLab2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class HashTableRunner {
	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		try {
			Scanner kb = new Scanner(new
			
			File("C:\\Users\\suvan\\Desktop\\CS3 labs\\HashLab2\\src\\HashLab2\\words.dat"));
			
			int num = kb.nextInt();
			kb.nextLine();
			for (int i = 0; i < num; i++) {
				String word = kb.nextLine().trim();
				hashTable.add(word);
			}
			System.out.println(hashTable);
		} catch (FileNotFoundException e) {
			System.out.println("Meow, you've got to be kitten me! :3");
		}
	}
}