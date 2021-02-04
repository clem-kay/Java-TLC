import java.util.ArrayList;

public class NaughtyStudent extends Student{
    public NaughtyStudent(ArrayList<Double> marks) {
        super(marks);
    }

    public double getNaughtyAverageGrade(){
        double average = getAverageGrade();
        average += average*0.1;
        return average;

    }
}


