import java.util.ArrayList;

public class ClassReport {
    private final ArrayList<Student> students;
    public ClassReport(){
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void printReport(){
        System.out.println("Class Report");
        System.out.println("========================================");
        for(Student student : students){
            System.out.printf("Name: %s | ID: %s | Average: %.2f | Grade: %s%n",
                    student.getName(), student.getId(), student.calculateAverage(), student.getLetterGrade());
        }
    }
    public double calculateClassAverage(){
        if(students.isEmpty()){
            return 0;
        }
        int totalGrades = 0;
        double sum = 0;
        for(var students : students){
            for(var grade : students.getGrades()){
                sum += grade;
                totalGrades++;
            }
        }
        return  sum / totalGrades;
    }
    public double calculateHighest(){
        if(students.isEmpty())
            return  0;
        double highest = Double.MIN_VALUE;
        for(var students : students){
            for(var grade : students.getGrades()){
                if(grade > highest)
                    highest = grade;
            }
        }
        return highest;
    }
    public double calculateLowest(){
        if(students.isEmpty())
            return  0;
        double lowest = Double.MAX_VALUE;
        for(var students : students){
            for (var grade: students.getGrades()){
                if(grade < lowest)
                    lowest = grade;
            }
        }
        return lowest;
    }
}
