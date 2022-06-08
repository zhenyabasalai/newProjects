package javadz.lesson07062022;

import java.util.Scanner;

public class BankInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input sum: ");
        float sum = input.nextInt();
        System.out.print("Input month: ");
        int month = input.nextInt();
        float sumWQ = sum * 7 / 100;
        float allSum = 0;
        for (int a = 0; a < month; a++) {
            allSum = sum + sumWQ;
            sum = allSum;
        }
        System.out.print("Final amount: " + allSum);


    }
}
