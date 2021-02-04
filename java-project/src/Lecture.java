import java.util.ArrayList;
import java.util.Collections;

public class Lecture {
    ArrayList<Student> lectureGrades = new ArrayList<Student>();

    public void enter (Student student){
        lectureGrades.add(student);
    }
    public double getHighestAverageGrade(){
        double max = 0.0;
        for( Student s:lectureGrades){
            if(s.getAverageGrade() > max){
                max=s.getAverageGrade();
            }
        }
        return max;
    }

}
