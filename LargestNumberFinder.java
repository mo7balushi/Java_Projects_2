package Java_Projects_2;

import java.util.Scanner;
public class LargestNumberFinder {
    public static void main(String[] args) {
        // Numbers
        int[] numbers = {45, 89, 12, 67, 34};
        int largest = numbers[0];
        // Loop numbers
        for (int i = 1; i < numbers.length; i++) {
            int number = numbers[i];
            // If current number is bigger, update largest
            if (number > largest) {
                largest = number;
            }
        }
        // Display the largest number
        System.out.println("Number is " + numbers);
        System.out.println("Largest Number: " + largest);
    }
}
