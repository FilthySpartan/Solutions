package Lab05;

import java.util.Scanner;

public class Lab5 {

	public  int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);	
		int result = s.nextInt();
		s.close();	
		return result;

	}
	
	public  String getString(String prompt, Scanner scanner) {
		System.out.println(prompt);	
		return scanner.nextLine();
				
	}
	
	public void grades() {
		
		int grade = getInt("Enter a grade(1 - 100): ");
		
		if (grade < 50) {
			System.out.println("Fail");
		} else if (grade >= 50 && grade <= 60) {
			System.out.println("Pass");
		} else if (grade >= 61 && grade <= 70) {
			System.out.println("Merit");
		} else if (grade >= 71 && grade <= 100) {
			System.out.println("Distinction");
		}
				
	}
	
	public void part2() {
		boolean isSummer = false;
		boolean isEarlyEvening = false;
		Scanner s = new Scanner(System.in);
		String summer = getString("Is it summer?(yes/no):", s);
		String earlyEvening = getString("Is it early evening?(yes/no):", s);

		if (summer.equals("yes")) {
			isSummer = true;
		}
						
 	    if (earlyEvening.equals("yes")) { 
 	   	 isEarlyEvening = true;
 	    }		 
	   
	    System.out.println(isSummer);
	    System.out.println(isEarlyEvening);
	    
	    if (isSummer == false && isEarlyEvening == false) {
	   	 System.out.println("Take a shower");
	   	 System.out.println("Eat inside");
	   	 System.out.println("Contact friends");
		} else if (isSummer == true && isEarlyEvening == true) {
	 	 System.out.println("Take a shower");
	 	 System.out.println("Eat outside");
	 	 System.out.println("Do outdoor hobby");
		 System.out.println("Contact friends");
		} else if (isSummer == true && isEarlyEvening == false) {
		  System.out.println("Take a shower");
		  System.out.println("Eat inside");
		  System.out.println("Do outdoor hobby");
		  System.out.println("Contact friends");
		} else  {
		  System.out.println("Take a shower");
		  System.out.println("Eat inside");
		  System.out.println("Take a walk");
		  System.out.println("Contact friends");
		}  
		 	 
		 s.close();
	}
}
