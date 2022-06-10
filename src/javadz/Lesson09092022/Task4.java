package javadz.Lesson09092022;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arrays1 = {4, 8, 7, 5, 2};
        System.out.println(Arrays.toString(arrays1));
        int[] arrays2 = {3, 8, 4, 5, 4};
        System.out.println(Arrays.toString(arrays2));
        double sum = 0;
        for (int x : arrays1) {
            sum += x;
        }
        double sum1 = 0;
        for (int x : arrays2) {
            sum1 += x;

        }
        if (sum1 > sum) {
            System.out.println("Еhe average value of the second array is greater than the first");
        } else if (sum > sum1) {
            System.out.println("The average value of the first array is greater than the second");

        } else {
            System.out.println("The average values of the first and second are");

        }
    }
}
