import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassReport classReport = new ClassReport();
        boolean addMoreStudent = true;

        while(addMoreStudent){
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student ID: ");
            String id = scanner.nextLine();
            Student student = new Student(id,name);

            boolean addMoreGrades = true;
            while(addMoreGrades){
                System.out.println("Enter student grades for: " + name);
                String input = scanner.nextLine();
                if(input.equalsIgnoreCase("done"))
                    addMoreGrades = false;
                try{
                    double grade = Double.parseDouble(input);
                    student.addGrade(grade);
                }catch(NumberFormatException ex){
                    System.out.println("Please enter numbers or type 'done' if finished.");
                }catch (IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                }
            }
            classReport.addStudent(student);
            System.out.println("Would you like to add more students? (yes/no)");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("no"))
                addMoreStudent = false;
        }
        classReport.printReport();
        System.out.printf("Class average: %.2f%n", classReport.calculateClassAverage());
        System.out.printf("Highest grade: %.2f%n", classReport.calculateHighest());
        System.out.printf("Lowest grade: %.2f%n", classReport.calculateLowest());
    }
}