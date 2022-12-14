package PlusStudy.javajigi_inflearn.calandar.develop4;

public class CalendarDevelop4 {

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static int getMaxDaysOfMonth(int year, int month){
        if(isLeapYear(year)){
            return LEAP_MAX_DAYS[month - 1];
        }
        else {
            return MAX_DAYS[month - 1];
        }
    }

    public static void printCalendar(int year, int month, int weekday) {
        System.out.printf("         <<%4d년 %3d월>>\n", year, month);
        System.out.println("  SU  MO  TU  WE  TH  FR  SA");
        System.out.println("-----------------------------");

        // print blank space
        for(int i = 0; i < weekday; i++){
            System.out.print("    ");
        }

        int maxday = getMaxDaysOfMonth(year, month);
        int count = 7 - weekday;
        int delim = (count < 7) ? count : 0;

//         int delim;
//        if(count < 7){
//            delim = count;
//        }else{
//            delim = 0;
//        }

        // print first line
        for(int i = 1; i <= count; i++){
            System.out.printf("%4d", i);
        }
        System.out.println();

        // print from second line to last
       // count++;
        for (int j = count+1; j <= maxday; j++) {
            System.out.printf("%4d", j);
            if (j % 7 == delim) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }
    }
