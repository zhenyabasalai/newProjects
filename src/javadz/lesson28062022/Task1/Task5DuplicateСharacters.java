package javadz.lesson28062022.Task1;

public class Task5DuplicateСharacters {

    public String repeatAllSymbol(String str) {
        int l = str.length();
        String newstring = "";
        for (int i = 0; i < l; i++) {
            newstring += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        System.out.println(newstring);
        return newstring;
    }

}
