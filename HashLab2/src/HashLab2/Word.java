package HashLab2;

public class Word {
	private String theValue;
	
	//write a constructor method
	public Word(String value) {
		theValue = value;
	}
	
	//write the getValue method
	public String getValue() {
		return theValue;
	}
	
	//write a method to count how many vowels theValue has
	private int countVowels() {
		int c = 0;
		for (char i : theValue.toCharArray()) {
			if("AEIOUaeiou".indexOf(i) != -1) {
				c++;
			}
		}
		return c;
	}
	
	//write the equals method
	public boolean equals(Object obj) {
		if(obj instanceof Word) {
			Word w = (Word)obj;
			return this.getValue() == w.getValue();
		}
		return false;
	}
	
	//write the hashCode method
	public int hashCode() {
		int vow = countVowels();
		int let = theValue.length();
		return (vow * let) % 10;
	}
	
	//write the toString method
	public String toString() {
	
	return theValue;
	}
}