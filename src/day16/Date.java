package day16;

import java.time.LocalDateTime;
import java.time.Period;

public class Date {
    public static void main(String[] args) {
        birthDate1();
    }

    public static void birthDate1(){
        LocalDateTime date = LocalDateTime.of(2022, 2, 23, 12, 8, 0);
        Period y = Period.ofYears(25);
        Period d = Period.ofDays(15);
        Period m = Period.ofMonths(2);
        date = date.minus(y);
        date = date.minus(d);
        date = date.plus(m);
        System.out.println(date.toLocalDate());
    }
}
