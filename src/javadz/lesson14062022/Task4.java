package javadz.lesson14062022;

public class Task4 {
    public static void main(String[] args) {
        int[][] Array = {{7, 7, 3, 5}, {1, 4, 1, 3}, {4, 1, 7, 3}};
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                sum = sum + Array[i][j];
            }
        }
        System.out.println("Sum: " + sum);
    }
}
