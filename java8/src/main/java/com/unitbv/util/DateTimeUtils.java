package com.unitbv.util;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoField;

public class DateTimeUtils {

    // Get the number of years until the given date
    public static int getNumberOfYearsUntil(LocalDate date){
        LocalDate currentDate = LocalDate.now();
        return Period.between(currentDate,date).getYears();
    }

    // Check if the given date occurs on Friday the 13th
    public static boolean isDateOccurringOnFriday13th(LocalDate date){
        return date.get(ChronoField.DAY_OF_MONTH) == 13 && date.get(ChronoField.MONTH_OF_YEAR) == 1;
    }
}
