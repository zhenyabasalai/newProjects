package javadz.lesson09062022;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number : ");
        int i = input.nextInt();
        int[] array;
        array = new int[i];
        for (int a = 0; a < array.length; a++) {
            array[a] = ((int) (Math.random() * i));
            System.out.print(array[a]);
        }
        int max = array[0];
        int min = array[0];
        for (int a = 0; a != array.length; a++) {
            if (array[a] > max) {
                max = array[a];
            }

            if (array[a] < min) {
                min = array[a];
            }
        }
        double sum = 0;
        for (int x : array) {
            sum += x;
        }
        System.out.println(" Min: " + min + " " + "Max: " + max + " Midd: " + sum / array.length);
    }
}
