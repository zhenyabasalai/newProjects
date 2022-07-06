package javadz.lesson28062022.Task1;

import java.util.Scanner;

public class NambOfDocements {
    public static void printFirstTwoBlocks(String str) {
        System.out.println("Input namber of documents");
        Scanner namber = new Scanner(System.in);
        String str0 = namber.nextLine();
        System.out.println(str.substring(0, 3) + " " + str.substring(9, 13));
    }

    public static void replaceThelettersWithTheSymbol(String str) {
        String value = str.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(value);
    }

    public static void printWithSlash(String str) {

        System.out.println("Input namber of documents");
        Scanner namber1 = new Scanner(System.in);
        String str1 = namber1.nextLine();
        String[] words = str.split("-");
        StringBuilder sb = new StringBuilder();
        sb.append(words[1].toUpperCase()).append("/");

        Character character = words[4].charAt(1);
        sb.append(character.toString().toUpperCase()).append("/");

        Character character1 = words[4].charAt(3);
        sb.append(character1.toString()).append("/");

        System.out.println(sb);


    }

    public static void printWithSlashWithCaps(String str) {
        String[] words = str.split("-");
        StringBuilder sb = new StringBuilder("Letters:");
        sb.append(words[1].toUpperCase()).append("/");
        sb.append(words[3].toUpperCase()).append("/");

        Character character = words[4].charAt(1);
        sb.append(character.toString().toUpperCase()).append("/");

        Character character1 = words[4].charAt(3);
        sb.append(character1.toString().toUpperCase()).append("/");

        System.out.println(sb);
    }

    public static void doesAbcContain() {
        System.out.println("Input namber of documents");
        Scanner namber1 = new Scanner(System.in);
        String str = namber1.nextLine();
        String[] words = str.split("-");
        for (int i = 0; i < words.length; i++) {

            String abc = "abc";
            System.out.println(abc.equalsIgnoreCase(words[i]));
        }

    }

    public static void сheckingForAvailability() {
        System.out.println("Input namber of documents");
        Scanner namber1 = new Scanner(System.in);
        String str = namber1.nextLine();
        System.out.println(str.startsWith("555"));
    }

    public static void сheckingForAvailabilityAtTheAnd() {
        System.out.println("Input namber of documents");
        Scanner namber1 = new Scanner(System.in);
        String str = namber1.nextLine();
        System.out.println(str.endsWith("1a2b"));
    }
}
