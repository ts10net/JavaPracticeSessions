package main.hackerRank;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class CalendarWeekday {
    private static String getDay(String dayStr, String monthStr, String yearStr) {
        int y = Integer.valueOf(yearStr);
        int m = Integer.valueOf(monthStr);
        int d = Integer.valueOf(dayStr);
        if (y <= 2000 || y >= 3000) {
            return "";
        }

        Calendar cal = Calendar.getInstance();
        cal.set(y, m - 1, d);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase();

        /*Date date = (new GregorianCalendar(year, month, day)).getTime();
        SimpleDateFormat f = new SimpleDateFormat("EEEE");
        String day2 = f.format(date);
        System.out.println(day2.toUpperCase());*/
    }

    private static final String[] DAYS = {"SUNDAY", "MONDAY","TUESDAY", "WEDNESDAY", "THURSDAY","FRIDAY","SATURDAY"};

    private static String getDayNoApi(String dayStr, String monthStr, String yearStr) {
        int year = Integer.valueOf(yearStr);
        int month = Integer.valueOf(monthStr);
        int day = Integer.valueOf(dayStr);

        int a = (14 - month) / 12;
        int y = year - a;
        int m = month + 12 * a - 2;

        int d = (day + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
        return (DAYS[d]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 8 5 2015 : WEDNESDAY
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDayNoApi(day, month, year));
    }
}
