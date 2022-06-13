package javadz.lesson09062022;

import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        boolean found = false;
        int[] mas = {4, 8, 7, 5, 2, 3};

        System.out.println(Arrays.toString(mas));
        System.out.println("Input namber: ");
        Scanner namb = new Scanner(System.in);
        int a = namb.nextInt();
        for (int x : mas) {
            if (x == a) {
                found = true;
                break;
            }
        }
        System.out.println("included in the array? : " + found);
    }
}
