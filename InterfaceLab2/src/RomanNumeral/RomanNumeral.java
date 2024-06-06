package RomanNumeral;


public class RomanNumeral {

	private int[] listNums = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	private String[] listLetters = new String[] {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	private int num = 0;
	private String romanNum = "";
	
	
	public RomanNumeral(int i) {
		num = i;
		convertNumToRoman(i);
	}
	
	public RomanNumeral(String s) {//XXV
		romanNum = s;
		convertRomanToNum(s);
	}
	
	public int getNum() {
		return num;
	}

	
	public String getRomanNum() {
		return romanNum;
	}
	  
	public void convertRomanToNum(String s) {
		s = s.replace("IV","IIII");  
	    s = s.replace("IX","VIIII");  
	    s = s.replace("XL","XXXX");  
	    s = s.replace("XC","LXXXX");  
	    s = s.replace("CD","CCCC");  
	    s = s.replace("CM","DCCCC"); 
		String[] bal = s.split("");
		for(String k : bal) {
			int c = 0;
			for (String e : listLetters) {
		        if (e.equals(k)) {
		        	break;
		        } else {
		        	c++;
		        }
		    }
			num += listNums[c];
		}
		System.out.println(romanNum + " is " + num);
	
	 }
	
	public void convertNumToRoman(int t) {	 
		for(int i=0;i<listNums.length;i++)  {  
			while(t >= listNums[i]) {  
				t = t - listNums[i];  
				romanNum += (listLetters[i]);  
			}  
		}  
		System.out.println(num + " is " + romanNum);  
	
	 }


	public boolean isBigger(RomanNumeral other) {
		return getNum()> other.getNum();
	}


	public int compareTo(RomanNumeral other) {
		return getNum() - other.getNum();
	}
}
