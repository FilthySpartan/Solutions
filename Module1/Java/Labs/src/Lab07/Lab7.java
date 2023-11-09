package Lab07;

public class Lab7 {
    
    public void start() {
        int[] numbers = { 1, -3, 5, 7, 0, 4, 6, 8 };
        System.out.println("sum of numbers = " + sum(numbers));
        System.out.println("average value = " + average(numbers));
        System.out.println("lowest = " + minimum(numbers));
        System.out.println("highest = " + maximum(numbers));
        System.out.println("index of 0 = " + getIndex(numbers));
        bubbleSort(numbers);
    }

    public static int sum(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }

        return result;
    }

    public static int average(int[] numbers) {
        int total = 0;

        for (int num : numbers) {
            total += num;
        }
        int result = total / numbers.length;

       return result;
    }

    public static int minimum(int[] numbers) { 
        int lowest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (lowest > numbers[i]) {
                lowest = numbers[i];
             }           
        }
        return lowest;
    }

    public static int maximum(int[] numbers) {
        int highest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (highest < numbers[i]) {
                highest = numbers[i];
            }
        }
    return highest;
    }

    public static int getIndex(int[] numbers) {
    int result = -1000;

        while (result != 0) {
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] == 0) {
                    result = numbers[i];
                }
            }
        }

    return result;
    }
      
    public static void bubbleSort(int[] numbers) {  
        int len = numbers.length;
        boolean swapped = false;
        do {
            swapped = false;
            for(int i = 1; i <= len-1; i++) {
                if(numbers[i-1] > numbers[i]) {
                    int shiftLeft = numbers[i];
                    numbers[i] = numbers[i-1];
                    numbers[i-1] = shiftLeft;
                    swapped = true;                    
                }
            }
            len--;
        } while (swapped);

        for( int num : numbers){
        System.out.print(num);
        }
    }
}
