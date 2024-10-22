import java.util.ArrayList;

public class Student {

    private final String id;
    private final String name;
    private final ArrayList<Double> grades;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(Double grade){
        grades.add(grade);
    }

    public double calculateAverage(){
        if(grades.isEmpty())
            return 0;
        double sum = 0;
        for(double grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    public String getLetterGrade(){
        double average = calculateAverage();
        if(average >= 90)
            return "A";
        else if (average >= 80)
            return "B";
        else if (average >= 70)
            return "C";
        else if (average >= 60)
            return "D";
        else if (average >= 50)
            return "E";
        else
            return "F";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }
}
