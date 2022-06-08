package javadz.lesson07062022;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        System.out.print("Enter any positive integer: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}