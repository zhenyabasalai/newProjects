package javadz.lesson14062022;

import java.util.Arrays;

public class TaskSort {
    public static void main(String[] args) {
        int[][] Array = {{7, 7, 3, 5}, {1, 4, 1, 3}, {4, 1, 7, 3}};
        System.out.println(Arrays.deepToString(Array));
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                Arrays.sort(Array[i]);
            }
        }
        System.out.println(Arrays.deepToString(Array));
    }
}
