package at.braendle.campus.basics;
import  at.braendle.campus.classes.CalendarClass;

import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.time.YearMonth;


public class Calender {



    public static void main(String[] args) {


        int month = 2;
        int startDay = 0;








        String tempDate = "2021-04-01";
        LocalDate date = LocalDate.parse(tempDate);
        DayOfWeek day = date.getDayOfWeek();
        int daysInMonth = date.lengthOfMonth();

        System.out.println("Der Monat hat: "+daysInMonth+" Tage");

        System.out.println("MO\tDI\tMI\tDO\tFR\tSA\tSO");

        startDay = CalendarClass.switchMethod(day);


        CalendarClass.outputCalenderDays(startDay,daysInMonth);


    }
}

