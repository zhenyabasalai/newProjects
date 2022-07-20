package javadz.lesson19072022;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2Stream {
    public static void main(String[] args) {
        List<String> nameStudent = new ArrayList<>();

        nameStudent.add("Vanya");
        nameStudent.add("Zhenya");
        nameStudent.add("Valera");
        nameStudent.add("Tom");
        nameStudent.add("ZhenYa");
        nameStudent.add("Dima");

        long stream = nameStudent.stream()
                .filter(a -> "ZhenyA".equalsIgnoreCase(a))
                .count();
        System.out.println(stream);

        List<String> stream1 = nameStudent.stream()
                .filter(a -> a.startsWith("V"))
                .collect(Collectors.toList());

        System.out.println(stream1);

        List<String> stream2 = nameStudent.stream()
                .sorted()
                .limit(1)
                .collect(Collectors.toList());
        if (stream2.isEmpty()) {
            System.out.println("Empaty@");
        }
         else {
            System.out.println(stream2);

        }
    }
}
