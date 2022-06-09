package javadz.lesson07062022;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number : ");
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.print("Even number");
        } else {
            System.out.print("Odd number");
        }
    }

}
