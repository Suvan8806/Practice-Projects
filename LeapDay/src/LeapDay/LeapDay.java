package LeapDay;

import java.util.ArrayList;

public class LeapDay {
	public LeapDay() {
		
	}
    public static ArrayList<Integer> findLeapYears(int startYear, int endYear) {
        ArrayList<Integer> leapYears = new ArrayList<>();
        for (int year = startYear; year <= endYear; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                leapYears.add(year);
            }
        }
        String output = "";
		for(int i = 0; i < leapYears.size(); i++) {
			output += leapYears.get(i) + " ";
		}
        return leapYears;
    }

    public static int calculateAgeOnLeapDay(int year) {
    	return (2024-year) / 4;
    }
}
