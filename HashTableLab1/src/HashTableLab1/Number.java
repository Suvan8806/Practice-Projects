package HashTableLab1;

public class Number {
	private int theValue;
	
	public Number(int value) 	{
		theValue = value;
	}	
	
	public int getValue() {
		return theValue;
	}
	
	public boolean equals(Object obj) {
		if (this.equals(obj)) {
			return true;
		}
		return false;
	} 
	
	public int hashCode() {
		return theValue%10;
	}

	public String toString() {
		return Integer.toString(theValue);
	}	
}
