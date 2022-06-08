package javadz.lesson07062022;

import java.util.Scanner;

public class OutdoorTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a temperature : ");
        int t = input.nextInt();
        if (t > -5) {
            System.out.print("Heat");
        } else if (t <= -5 && t > -20) {
            System.out.print("Normally");
        } else if (t <= -20) {
            System.out.print("Cold");
        }
    }
}
