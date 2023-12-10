import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index = 0, unit, score, noOfCourses;

        System.out.println("\nWelcome to your personal GPA calculator\n");
        System.out.println("*******************************************\n");
        System.out.print("How many courses do you want to compute for? ");

        noOfCourses = validateInput(input, 1, Integer.MAX_VALUE);

        CourseInfo[] courses = new CourseInfo[noOfCourses];

        try {
            while (index < noOfCourses) {
                System.out.printf("\nEnter the details for course %d\n\n\tCourse name: ", index + 1);
                String code = input.nextLine();
                System.out.print("\n\tCourse unit (min: 1, max:6): ");
                unit = validateInput(input, 1, 6);
                System.out.print("\n\tScore (min: 0, max: 100): ");
                score = validateInput(input, 0, 100);

                CourseInfo course = new CourseInfo(code, unit, score);
                courses[index] = course;
                index++;
            }
        } catch (InputMismatchException ex) {
            System.out.println("\n\t\tYou have entered a non-integer value. Please re-enter details for the course.");
        } finally {
            input.close();
        }
        printTable(courses);
    }

    private static int validateInput(Scanner input, int lowerBound, int upperBound) {
        int value;
        while (true) {
            try {
                value = input.nextInt();
                if (value < lowerBound || value > upperBound) {
                    System.out.printf("\n\t\tEnter a value between %d and %d: ", lowerBound, upperBound);
                } else {
                    input.nextLine();
                    break;
                }
            } catch (InputMismatchException ex) {
                System.out.print("\n\t\tInvalid input. Please enter a valid integer: ");
                input.nextLine();
            }
        }
        return value;
    }
    public static double averageFunction(CourseInfo[] courses) {
        double totalGradePoint = 0;
        double totalGradeUnit = 0;

        for (CourseInfo course : courses) {
            totalGradePoint += course.getGradeUnit() * course.getCourseUnit();
            totalGradeUnit += course.getCourseUnit();
        }
        return totalGradePoint / totalGradeUnit;
    }
    private static void printTable(CourseInfo[] courses) {
        System.out.println("\n*** The semester breakdown ***\n");
        System.out.println("|---------------|-------------|-------|------------|\n");
        System.out.printf("| %13s | %11s | %5s | %10s |\n", "COURSE & CODE", "COURSE UNIT", "GRADE", "GRADE-UNIT");
        System.out.println("|---------------|-------------|-------|------------|\n");
        for (CourseInfo course : courses) {
            System.out.printf("| %-13s | %-11d | %-5s | %-10d |\n", course.getCourseCode(), course.getCourseUnit(), course.getGrade(), course.getGradeUnit());
        }
        System.out.println("|--------------------------------------------------|\n");
        double gpa = averageFunction(courses);
        System.out.printf("Your GPA = %.2f\n", gpa);
    }
}
