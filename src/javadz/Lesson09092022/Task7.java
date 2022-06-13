package javadz.Lesson09092022;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        String[] arrays1 = {"Tom", "Jack", "Emma", "Harry", "Oscar"};
        System.out.println(Arrays.toString(arrays1));
        Arrays.sort(arrays1);
        int i;
        for (i = 0; i < arrays1.length; i++) {
            System.out.println(arrays1[i]);
        }
    }
}
