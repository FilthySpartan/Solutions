package Lab03;

import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Lab3Exercises myLab3 = new Lab3Exercises();
		
		String mainCourse = myLab3.getString("What main dish would you like? (Fish, burgers or veg): ");
		int spuds = myLab3.getInt("How many roast potatoes would you like?: ");
		int sprouts = myLab3.getInt("How many Brussel Sprouts would you like?:");
		
		System.out.println(myLab3.theLunchQueue(mainCourse, spuds, sprouts));
		
		System.out.println("Enter total weight in KG: ");
		Scanner s = new Scanner(System.in);
		int kg = s.nextInt();
		myLab3.convertKgsToStonesPounds(kg);
		
		s.close();
	}
	

}
