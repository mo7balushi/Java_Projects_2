package Java_Projects_2;

public class MultiplicationCalculator {
    public static void main(String[] args) {
         // Declare start and set it
        int start=1;
        // Declare end and set it
        int end =5;
        // Declare result
        int result=1;
        // start looping
        for (int i=start;i<=end;i++) {
            result= i*result;

        }
        // display result 
        System.out.println("Multiplication Result: "+result);


    }
}
