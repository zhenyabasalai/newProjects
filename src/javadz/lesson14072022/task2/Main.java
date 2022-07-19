package javadz.lesson14072022.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(" Next tuesday   " + date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
        System.out.println(date.getDayOfWeek());
    }
}
