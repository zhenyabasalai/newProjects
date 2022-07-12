package javadz.lesson28062022.Task1;

public class Task2MaxAndMinWord {

    public static void findShotWord(String str) {
        String[] words = str.split(" ");
        String shortestword = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortestword.length()) {
                shortestword = words[i];

            }
        }
        System.out.printf(shortestword);


    }

    public static void findLongWord(String str) {
        String[] words = str.split(" ");
        String shortestword = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > shortestword.length()) {
                shortestword = words[i];

            }
        }
        System.out.printf(shortestword);
    }
}