package RomanNumeral;

public class RomanNumberalRunner {
	public static void main(String [] args) {
		
		
		int[] wow = new int[] {10,100,1000,2500,1500,23,38,49}; 
		for(int k : wow) {
			RomanNumeral rom = new RomanNumeral(k);
		}
		String[] wow2 = new String[] {"LXXVII","XLIX","XX","XLIX"};
		for(String k : wow2) {
			RomanNumeral rom = new RomanNumeral(k);
		}
		
		

		System.out.println("\nRoman 1 :: XXI");
		RomanNumeral rOne = new RomanNumeral("XXI");

		System.out.println("Roman 2 :: XXV");
		RomanNumeral rTwo = new RomanNumeral("XXV");
		
		
		System.out.println("\nrOne.equals(rTwo) == " + rOne.equals(rTwo));
		System.out.println("rOne.compareTo(rTwo) == " + rOne.compareTo(rTwo));
		System.out.println("rTwo.compareTo(rOne) == " + rTwo.compareTo(rOne));
	

	}
}
