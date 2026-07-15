package Java_Projects_2;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        // Number to check
        int number = 153;
        int originalNumber = number;
        int digit;
        int sum = 0;
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        temp = number;
        while (temp > 0) {
            digit = temp % 10;
            // Add
            sum = sum + (int) Math.pow(digit, count);
            temp = temp / 10;
        }
        // Display
        System.out.println("Number: " + originalNumber);
        if (sum == originalNumber) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}