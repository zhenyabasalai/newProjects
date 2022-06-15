package javadz.lesson14062022;

import java.util.Arrays;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        int[][][] array = {{{4, 7, 8, 4}, {7, 2, 1}}, {{5, 6, 3}}};
        System.out.print("Input digits: ");
        Scanner namb = new Scanner(System.in);
        int a = namb.nextInt();
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {

                    array[i][j][k] += a;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}

