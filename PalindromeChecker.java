package Java_Projects_2;

public class PalindromeChecker {
    public static void main(String[] args) {
        int number = 1221;
        int originalNumber = number;
        // store the reversed number
        int reversedNumber = 0;
        // store each  digit
        int digit;
        while (number > 0) {
            // last digit
            digit = number % 10;

            //reversed number
            reversedNumber = reversedNumber * 10 + digit;

            // Remove the last digit
            number = number / 10;
        }
        // Display the original number
        System.out.println("Number: " + originalNumber);
        // Compare original number with reversed number
        if (originalNumber == reversedNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}