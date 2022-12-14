package PlusStudy.javajigi_inflearn.calandar.calendardevelop3answer;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class CalendarDevelop3_answer {
    private final static int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getMaxDaysOfMonth(int month){
        return MAX_DAYS[month-1];
    }

    public static void printCalendar(int year, int month){
        System.out.printf("         <<%4d %3d>>\n", year, month);
        System.out.println("  SU  MO  TU  WE  TH  FR  SA");
        System.out.println("-----------------------------");

        int maxday = getMaxDaysOfMonth(month);

        for(int i = 1; i < maxday; i++){
            System.out.printf("%4d", i);
            if(i % 7 == 0){
                System.out.println();
            }
        }

        System.out.println();





//        System.out.println(" 1  2  3  4  5  6  7");
//        System.out.println(" 8  9 10 11 12 13 14");
//        System.out.println("15 16 17 18 19 20 21");
//        System.out.println("22 23 24 25 26 27 28");
    }


}
