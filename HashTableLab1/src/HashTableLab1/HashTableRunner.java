package HashTableLab1;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import static java.lang.System.*;

public class HashTableRunner
{
  public static void main ( String[] args ) throws FileNotFoundException
  {
	  try {
		// make a new table
		HashTable t = new HashTable();
		// read from the file
		Scanner kb = new Scanner(new File("C:\\Users\\suvan\\Desktop\\CS3 labs\\HashTableLab1\\src\\HashTableLab1\\numbers.dat"));

		// load stuff into the table
		int lines = kb.nextInt();
		kb.nextLine();
		for (int i = 0; i < lines; i++) {

		t.add(new Number(kb.nextInt()));
		}
		kb.close();
		// print out the table
		System.out.println(t);
		} catch (Exception e) {
		System.out.println("Houston, we have a problem!");
		}
  }
}
