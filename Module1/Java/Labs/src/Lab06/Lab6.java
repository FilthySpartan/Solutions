package Lab06;

import java.util.Scanner;

public class Lab6 {
    public void part1 () {
        grades();

    }

    public void multiplicationTable() {
        for(int y = 1; y <= 10; y++){
            for(int x = 1; x <= 10; x++) {
                System.out.printf("%5d", y * x);
            }
            System.out.print("\n");
        }
    }

    public void inAccount() {
        float investment = 100;
        float current = investment;
        int interestRate = 5;
        int yearsToDouble = 0;
        float target = 200;

        do {
            current += (current / 100) * interestRate;
            System.out.println("Current funds: " + current);
            yearsToDouble++;
        } while (current < target);
        System.out.println("Current funds: " + current);
        System.out.println("Years to double: " + yearsToDouble);

    }

    public void grades() {
		
        String[] names = {"Tristan", "James", "Mark", "Steve", "Carl"};
        int[] marks = {75, 60, 65, 25, 99};
        
        for (int i = 0; i < names.length; i++) {
            String grade = "";
            if (marks[i] < 50) {
                grade = "Fail";
            } else if (marks[i] >= 50 && marks[i] <= 60) {
                grade = "Pass";
            } else if (marks[i] >= 61 && marks[i] <= 70) {
                grade = "Merit";
            } else if (marks[i] >= 71 && marks[i] <= 100) {
                grade = "Distinction";
            }

            System.out.println(names[i] + " scored: " + marks[i] + ", grade: " + grade);
        }				
	}

    public  int getInt(String prompt, Scanner scanner) {
            System.out.println(prompt);		
            int result = scanner.nextInt();
            scanner.close();	
            return result;
        }
}
