package AutoPartsMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PartRunner {
	public static void main(String[] args) throws IOException {
		PartList test = new PartList("C:\\Users\\suvan\\Desktop\\CS3 labs\\AutoPartsMap\\src\\AutoPartsMap\\partinfo.dat");
		System.out.println(test);
		
	}
}
