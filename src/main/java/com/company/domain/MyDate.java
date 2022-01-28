package com.company.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MyDate extends Date {
    public static LocalDate covertStringToLocalDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate;
    }


    public static String covertLocalDateToString(LocalDate localDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String stringDate = localDate.format(formatter);
        return stringDate;
    }
}
