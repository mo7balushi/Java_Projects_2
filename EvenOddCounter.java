package Java_Projects_2;
public class EvenOddCounter {
    public static void main(String[] args) {
        // Variable start abd set it .
        int start = 0;
        // Variable end and set it.
        int end = 100;
        // Variable even count  and set it.
        int evenCount = 0;
        // Variable odd count and set it.
        int oddCount = 0;
        // start loop
        for (int i = 0; i <= end; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
            else  {
                oddCount++;
            }
        }
        // display even count
        System.out.println("Even Counts : "+ evenCount);
        // display odd couny
        System.out.println("Odd Counts : "+ oddCount);
    }
}
