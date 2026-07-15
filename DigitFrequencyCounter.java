package Java_Projects_2;
public class DigitFrequencyCounter {
    public static void main(String[] args) {
        // Number to check
        int number = 122333;
        int originalNumber = number;
        int targetDigit = 3;
        // Counter
        int count = 0;
        int digit;
        // Loop
        while (number > 0) {
            digit = number % 10;
            if (digit == targetDigit) {
                count++;
            }
            // Remove last digit
            number = number / 10;
        }
        // Display the result
        System.out.println("Number: " + originalNumber);
        System.out.println("Target Digit: " + targetDigit);
        System.out.println("Frequency: " + count);
    }
}
