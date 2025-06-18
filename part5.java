import java.util.Scanner;

public class part5 {
    static String[] studentNames = new String[100];
    static int[] studentGrades = new int[100];
    static int studentCount = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add new Student");
            System.out.println("2. Search Student");
            System.out.println("3. Show report");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            userInput = input.nextInt();
            input.nextLine(); // consume newline

            switch (userInput) {
                case 1:
                    AddStudent(input);
                    break;
                case 2:
                    SearchStudent(input);
                    break;
                case 3:
                    ShowReport();
                    break;
                case 4:
                    System.out.println("You exited the system.");
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4.");
            }
        } while (userInput != 4);
    }

    public static void AddStudent(Scanner input) {
        if (studentCount >= studentNames.length) {
            System.out.println("Maximum student limit reached!");
            return;
        }

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student grade: ");
        int grade = input.nextInt();
        input.nextLine(); // consume newline

        if (grade < 0 || name.length() < 3) {
            System.out.println("this information isn't exite!");
        } else {
            studentNames[studentCount] = name;
            studentGrades[studentCount] = grade;
            studentCount++;
            System.out.println("you have rachestered new students: " + name);
        }
    }

    public static void SearchStudent(Scanner input) {
        System.out.print("Search for student: ");
        String searchName = input.nextLine();
        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            if (studentNames[i].equalsIgnoreCase(searchName)) {
                System.out.println("You searched for: " + studentNames[i] + ", Grade: " + studentGrades[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public static void ShowReport() {
        if (studentCount < 3) {
            System.out.println("please enter new students at list 3 number .");
            return;
        }

        int sum = 0;
        int highest = studentGrades[0];
        int lowest = studentGrades[0];

        for (int i = 0; i < studentCount; i++) {
            int grade = studentGrades[i];
            sum += grade;

            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        double average = (double) sum / studentCount;

        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }
}
