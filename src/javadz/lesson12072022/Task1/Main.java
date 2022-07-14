package javadz.lesson12072022.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 4.5f);
        Student student2 = new Student("Roma", 4.0f);
        Student student3 = new Student("Tom", 5.0f);
        Student student4 = new Student("Harry", 3.5f);
        Student student5 = new Student("Bony", 3.4f);


        List<Student> allStudent = new ArrayList<>();

        allStudent.add(0, student1);
        allStudent.add(1, student2);
        allStudent.add(2, student3);
        allStudent.add(3, student4);
        allStudent.add(4, student5);

        allStudent.remove(student5);
        allStudent.remove(student4);


    }
}
