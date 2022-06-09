package javadz.lesson07062022;

import java.util.Scanner;

public class MonthsOfTheYear  {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        while (!input.hasNextInt()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }

        int a = input.nextInt();

        if (a == 1) {
            System.out.println("Январь");
        } else if (a == 2) {
            System.out.println("Февраль");
        } else if (a == 3) {
            System.out.println("Март");
        } else if (a == 4) {
            System.out.println("Апрель");
        } else if (a == 5) {
            System.out.println("Май");
        } else if (a == 6) {
            System.out.println("Июнь");
        } else if (a == 7) {
            System.out.println("Июль");
        } else if (a == 8) {
            System.out.println("Август");
        } else if (a == 9) {
            System.out.println("Сентябрь");
        } else if (a == 10) {
            System.out.println("октябрь");
        } else if (a == 11) {
            System.out.println("Ноябрь");
        } else if (a == 12) {
            System.out.println("Декабрь");
        } else {
            System.out.println("Такого месяца нет");
        }


    }
}
