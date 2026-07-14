package Java_Projects_2;
public class  NumberReversal{
    public static void main(String[] args) {
        // Declare number variable and sit it.
        int number=12345;
        // Declare reverse number variable and sit it.
        int reversedNumber = 0;
        // Declare digit variable and sit it.
        int digit;
        // use loop to modify the reverse number and save the new values.
        while(number!=0){
            digit=number%10;
            reversedNumber=reversedNumber*10+digit;
            number=number/10;
        }
        // Display the original number.
        System.out.println("Original Number : 12345 ");
        //  Display the reverse number.
        System.out.println("Reversed Number: "+reversedNumber);
    }
}
