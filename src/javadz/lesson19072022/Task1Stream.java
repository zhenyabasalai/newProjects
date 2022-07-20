package javadz.lesson19072022;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task1Stream {
    public static void main(String[] args) {
        List<Integer> randomNambers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNambers.add((int) (Math.random() * 100));
            System.out.print(randomNambers.get(i) + " ");
        }
        List<Integer> nambers = randomNambers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(nambers);

        List<Integer> nambers1 = randomNambers.stream()
                .filter(a -> a > 7 && a < 17 && a % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(nambers1);

        Long nambers2 = randomNambers.stream()
                .collect(Collectors.counting());
        System.out.println(nambers2);

        List<Integer> nambers3 = randomNambers.stream()
                .map(a -> a * 2)
                .collect(Collectors.toList());
        System.out.println(nambers3);

        List<Integer> nambers4 = randomNambers.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(nambers4);

        Optional<Integer> nambers5 = randomNambers.stream()
                .reduce((a, b) -> a + b);
        System.out.println(nambers5.get() / (double) randomNambers.size());


    }
}
