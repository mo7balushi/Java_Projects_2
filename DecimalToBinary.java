package Java_Projects_2;
public class DecimalToBinary {
    public static void main(String[] args) {
        //Decimal number
        int number = 25;
        // Store original number
        int originalNumber = number;
        //  binary result
        String binary = "";
        //store the remainder after dividing by 2
        int remainder;
        // Loop
        while (number > 0) {
            // Get the remainder
            remainder = number % 2;
            // Add the remainder
            binary = remainder + binary;
            number = number / 2;
        }
        // Display
        System.out.println("Decimal Number: " + originalNumber);
        System.out.println("Binary Number: " + binary);
    }
}
