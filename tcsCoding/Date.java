package tcsCoding;

import java.time.LocalDate;
import java.time.Month;

public class Date {

    public static void main(String[] args) {
        System.out.println(getDay(15, "January"));
    }

    private static String getDay(int day, String month) {
//
        LocalDate ld = LocalDate.of(2018, Month.valueOf(month.toUpperCase()), day);
        ld = ld.plusDays(183);

        String str = "";
        str += ld.getDayOfMonth() - 1;
        str = str + " " + ld.getMonth().toString().charAt(0) + ld.getMonth().toString().substring(1).toLowerCase();

        return str;
    }
}
