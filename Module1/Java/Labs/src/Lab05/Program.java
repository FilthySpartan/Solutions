package Lab05;

public class Program {

	public static void main(String[] args) {
		
		int[] numbers = { 1, 3, 5, 7, 0, 4, 6, 8 };
		bubbleSort(numbers);
		
		
		
		
		
		
		
		
//		Lab5 lab5 = new Lab5(); 
//		//lab5.grades();
//		//lab5.part2();
//
//
//		int sum = 0;
//		int[] nums = {0,1,2,3,465,6};
//		for(int num: nums) {
//			sum += num;
//		}
//		System.out.println(sum);
//
//
//
//		for ( int i = 0; i < 3; i ++) {
//			System.out.println("A");
//			
//		
//			for (int j = 0; j < 5; j ++) {
//				System.out.println("B");
//
//			}
//			System.out.println("c");
//		}
//		System.out.println("d");
	}
	
	
	
	public static void bubbleSort(int[] numbers) {
		  
        boolean swapped = false;
        do {
            swapped = false;
            for(int i = 1; i <= numbers.length-1; i++) {
                if(numbers[i-1] > numbers[i]) {
                    int shiftLeft = numbers[i];
                    System.out.println("shiftleft = " + shiftLeft);
                    System.out.println("i-1 = " + numbers[i-1]);
                    numbers[i] = numbers[i-1];
                    numbers[i-1] = shiftLeft;
                    swapped = true;
                    
                }
            }
        } while (swapped == false);

        for( int num : numbers){
        System.out.print(num);
        }
    }
	

}
