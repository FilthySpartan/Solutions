package Lab03;

import java.util.Scanner;

public class Lab3Exercises {

	public  int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);	
		int result = s.nextInt();
		s.close();	
		return result;

	}
	
	public  String getString(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);		
		String result = s.nextLine();
		s.close();	
		return result;
		
				
	}
	
	public  String theLunchQueue(String mainCourse, int spuds, int sprouts) {
		String meal = "Hello, your lunch is " + mainCourse + " with " + spuds  + " roast potatoes and " + sprouts + " Brussel sprouts.";
		
		return meal;
	}
	
	public  void convertInputToStonesPounds(int pounds) {

		int stones = pounds / 14;
		int remainingPounds = pounds % 14;
		System.out.println(stones + " stones and " + remainingPounds + " pounds");
	}

	public void convertKgsToStonesPounds(int kg) {
		int pounds = (int) (kg * 2.20462);
		convertInputToStonesPounds(pounds);
		
	}
	
}
