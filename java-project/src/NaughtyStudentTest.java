import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NaughtyStudentTest {
    private static final double DELTA = 1e-15;
    @Test
    public void NaughtyStudentTest(){
        ArrayList<Double> marks = new ArrayList<Double>();
        marks.add(44.0);
        marks.add(50.0);
        marks.add(60.0);
        marks.add(20.1);
        marks.add(40.78);
        NaughtyStudent student = new NaughtyStudent(marks);

        double average = student.getNaughtyAverageGrade();
        double actual = (44.0 +60.0+50.0+20.1+40.78)/5;
        actual += actual*0.1;
        System.out.println(average);

        assertEquals(average,actual,DELTA);

    }
}
