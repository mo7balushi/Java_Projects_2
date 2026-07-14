package Java_Projects_2;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        // Store the three subject grades
        double grade1 = 85;
        double grade2 = 90;
        double grade3 = 80;
        //  average grade
        double average = (grade1 + grade2 + grade3) / 3;
        //  store the final result
        String status;
        // student status based on the average
        if (average >= 90) {
            status = "Excellent";
        } else if (average >= 75) {
            status = "Good";
        } else if (average >= 60) {
            status = "Pass";
        } else {
            status = "Fail";
        }
        // Display the grades,average,status
        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Grade 3: " + grade3);
        System.out.println("Average: " + average);
        System.out.println("Status: " + status);
    }
}