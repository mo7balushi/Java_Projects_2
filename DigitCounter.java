package Java_Projects_2;

public class DigitCounter {
    public static void main(String[] args) {
        // Number to count digits
        int number = 123456;
        // Store the original number
        int originalNumber = number;
        int count = 0;
        while (number > 0) {
            // Remove the last digit
            number = number / 10;

            // Increase count by 1 for each digit removed
            count++;
        }
        // Display the original number and number of digits
        System.out.println("Number: " + originalNumber);
        System.out.println("Number of digits: " + count);
    }
}
