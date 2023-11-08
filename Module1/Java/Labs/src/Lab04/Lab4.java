package Lab04;
import java.io.InputStream;
import java.util.Scanner;

public class Lab4 {

	

	public void part1() {
		Scanner s = new Scanner(System.in);
		System.out.println("Cost of a bag(p): ");
		int costPence = s.nextInt();
		
		if (costPence <= 0) {
			System.out.println("Cost cannot be less than 1p");
			s.close();
			return;
		} 
		s.nextLine();
		
		System.out.println("How much money available?: ");
		int availablePence = s.nextInt();
		
		
		if (availablePence < 0) {
			
			System.out.println("Cannot have negative money");
			s.close();
			return;
			
		} else if(availablePence >= 0 && availablePence < costPence) {
			
			System.out.println("Insufficient funds!");
			s.close();
			return;
		} 
		
			int numBag = availablePence / costPence;
			
			System.out.println("If the price is " + costPence + "p then you can buy " + numBag + " bags.");
					
			s.close();
	
		
		
		
	}


}
