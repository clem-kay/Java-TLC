import java.util.ArrayList;

public class Student implements Nameable{
    ArrayList<Double> studentGrades = new ArrayList<Double>();
    public Student(ArrayList<Double> marks){
        studentGrades = (ArrayList<Double>) marks.clone();
        System.out.println(studentGrades);
    }
    public double getAverageGrade(){
        double average,total =0;
        for (double mark : studentGrades){
            total +=mark;
        }
        average = total/ studentGrades.size();
        return average;
    }

    @Override
    public void getName() {
        System.out.println("........");
    }
}