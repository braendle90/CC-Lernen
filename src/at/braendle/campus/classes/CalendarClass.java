package at.braendle.campus.classes;

import at.braendle.campus.basics.Calendar;

import java.time.DayOfWeek;




public class CalendarClass {


    public static int switchMethod(DayOfWeek day) {


        int startDay = 0;


        switch (day) {

            case MONDAY:

                System.out.print("");
                startDay = 1;
                break;

            case TUESDAY:
                System.out.print("  \t");
                startDay = 2;
                break;
            case WEDNESDAY:
                System.out.print("  \t  \t");
                startDay = 3;
                break;
            case THURSDAY:
                System.out.print("  \t  \t  \t");
                startDay = 4;

                break;
            case FRIDAY:
                System.out.print("  \t  \t  \t  \t");
                startDay = 5;
                break;
            case SATURDAY:

                System.out.print("  \t  \t  \t  \t  \t");
                startDay = 6;

                break;
            case SUNDAY:

                System.out.print("  \t  \t  \t  \t  \t  \t");
                startDay = 7;
                break;


        }

        return startDay;


    }




    public static void outputCalenderDays(int startDay, int daysInMonth) {

        int numberOfDay = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = startDay; j <= 7; j++) {

                if (daysInMonth + 1 == numberOfDay) {

                    break;


                }

                System.out.print(+numberOfDay + "\t");
                numberOfDay += 1;
                startDay = 1;


            }
            System.out.println();

        }


    }
}
