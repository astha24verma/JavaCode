//    5.0  Create a class called Date that includes three instance variables—a month (type int), a day
//        (type int) and a year (type int). Provide a constructor that initializes the three instance variables
//        and assumes that the values provided are correct. Provide a set and a get method for each
//        instance variable. Provide a method displayDate that displays the month, day and year separated
//        by forward slashes (/). Write a test application named DateTest that demonstrates class Date’s
//        capabilities.
package com.mypack.assignment;

import java.time.LocalDate;
import java.time.Month;

class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate(){
        System.out.println("Date : " +getDay()+ "/" +getMonth()+ "/" +getYear());
    }

}

public class DateTest {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();    //LocalDate Class
        Date d1= new Date(todayDate.getDayOfMonth(), todayDate.getMonthValue(), todayDate.getYear());
        System.out.println("Today's ");
        d1.displayDate();
        System.out.println("-----------------");
        Date d2 = new Date(15,12,2000);
        d2.displayDate();

    }
}
