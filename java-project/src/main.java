import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Double> marks = new ArrayList<Double>();
        marks.add(44.0);
        marks.add(50.0);
        marks.add(60.0);
        marks.add(20.1);
        marks.add(40.78);
    Student clement = new Student(marks);
    Student b = new Student(marks);
    Student el = new Student(marks);

    Lecture TLC = new Lecture();
    TLC.enter(clement);
    TLC.enter(b);
    TLC.enter((el));

    double yo = TLC.getHighestAverageGrade();
        System.out.println(yo);

        NaughtyStudent s = new NaughtyStudent(marks);
//        System.out.println(s);
//        double a = s.getAverageGrade();
//        System.out.println(a);


    }
}

