package com.java.infinite;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestWeekand {

    // Helper method to check if a given date is a weekend
    public static boolean isWeekend(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY;
    }

    // Method to check for weekends between two dates
    public static void checkWeekends(Date startDate, Date endDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        int weekendCount = 0;
        while (!calendar.getTime().after(endDate)) {
            if (isWeekend(calendar.getTime())) {
                weekendCount++;
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        System.out.println("Weekends between the given dates: " + weekendCount);
    }

    public static void main(String[] args) throws java.text.ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Date (yyyy-MM-dd): ");
        Date startDate = sdf.parse(sc.next());
        System.out.println("Enter End Date (yyyy-MM-dd): ");
        Date endDate = sdf.parse(sc.next());

        checkWeekends(startDate, endDate);
        sc.close();
    }
}