import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Asking the teacher for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // less than 0 can not be allowed
        if (numStudents <= 0) {
            System.out.println("Invalid number of students !...");
            return;
        }

        ArrayList<Integer> grades = new ArrayList<>();
        
        // Take the Input of grades from teacher 
        System.out.println("Enter the grades of " + numStudents + " students: ");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Grade for student " + (i + 1) + ": ");
            int grade = sc.nextInt();
            grades.add(grade);
        }

        // Compute the Highest, Lowest and average grade
        int sum = 0, highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;
        
        for (int g : grades) {
            sum += g;
            if (g > highest) highest = g;
            if (g < lowest) lowest = g;
        }

        double average = (double) sum / numStudents;

        // Display results
        System.out.println("\n Students Grade Summary: ");
        System.out.println("Total Students: " + numStudents);
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }
}
