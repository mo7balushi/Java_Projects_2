package Java_Projects_2;

public class FibonacciSequence {
    public static void main(String[] args) {
        // Declare the variable and set it.
        int first =0 ;
        // Declare the variable and set it.
        int second=1 ;
        // Declare the variable and set it.
        int next=0;
        // Declare the variable and set it.
        int count = 15;
        // Display the first two fibonacci.
        System.out.print(first + " " + second + " ");
        // Use loop to Display the another
        for (int i = 3; i <= count; i++) {
            next = first + second;
            System.out.print(next + " ");
            // Modify the first.
            first = second;
            // Mid
            second = next;
        }
    }
}


