import java.util.Scanner; 
public class GradeCalculator {

public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in); 
    System.out.println("=== STUDENT GRADE CALCULATOR ===");
    System.out.print("Enter your full name: ");
    String fullName = scanner.nextLine();
    System.out.println("Hello, " + fullName + "! Let's calculate your average grade.");
    
   
    double grade1;
    do {
        System.out.print("Enter the first grade: "); 
        grade1 = scanner.nextDouble(); 
        if (grade1 < 0 || grade1 > 10) {
            System.out.println("Invalid grade. Enter a value between 0 and 10.");
        }
    } while (grade1 < 0 || grade1 > 10);

    double grade2;
    do {
        System.out.print("Enter the second grade: ");
        grade2 = scanner.nextDouble();
        if (grade2 < 0 || grade2 > 10) {
            System.out.println("Invalid grade. Enter a value between 0 and 10.");
        }
    } while (grade2 < 0 || grade2 > 10);
    
    double grade3;
    do {
        System.out.print("Enter the third grade: ");
        grade3 = scanner.nextDouble();
        if (grade3 < 0 || grade3 > 10) {
            System.out.println("Invalid grade. Enter a value between 0 and 10.");
        }
    } while (grade3 < 0 || grade3 > 10);

    double higgestGrade = Math.max(grade1, Math.max(grade2, grade3));
    System.out.println("\nHighest grade: " + higgestGrade);
    double lowestGrade = Math.min(grade1, Math.min(grade2, grade3));
    System.out.println("Lowest grade: " + lowestGrade);

    double average = (grade1 + grade2 + grade3) / 3; 
    System.out.println("\nStudent average: " + String.format("%.2f", average)); 
        if (average >= 5) {
            System.out.println("Result: PASSED");
            } else {
                System.out.println("Result: FAILED");
 
            }

    System.out.print("\nDo you want to calculate another student's average? (yes/no): ");
    String response = scanner.next();
    if (response.equalsIgnoreCase("yes")) {
        System.out.println("\nRestarting the program...\n");
        main(args);
    } else {
        System.out.println("=== END OF PROGRAM ===");
    }

    
    scanner.close();
    }
}
