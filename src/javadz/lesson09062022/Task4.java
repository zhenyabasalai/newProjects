package javadz.lesson09062022;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] array;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number : ");
        int i = 0;
        while (i <= 5 || i > 10) {
            if (input.hasNextInt()) {
                i = input.nextInt();
                if (i <= 5 || i > 10) {
                    System.out.println("PLease input corect number: ");
                }
            } else {
                System.out.println("You entered a not number, repeat : ");
                input.next();
            }
        }
        array = new int[i];
        int evenNums = 0;

        for (int a = 0; a < i; a++) {
            array[a] = ((int) (Math.random() * i));
            if (array[a] % 2 == 0) {
                evenNums++;
            }
        }
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[evenNums];
        int index = 0;
        for (int a = 0; a < i; a++) {
            if (array[a] % 2 == 0) {
                array2[index] = array[a];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
