package LeapDay;


public class LeapDayRunner {
	public static void main ( String[] args ) {
	 	   LeapDay ok = new LeapDay();
	 	   int min = 2000, max = 2030, year = 2000;
	 	   System.out.println("The leap years between " + min + " and " + max +" are: " + ok.findLeapYears(min, max));
	 	   System.out.println("If you were born on " + year + ", you are " + ok.calculateAgeOnLeapDay(year) + " Leap years old!");
	}
}
