package PlusStudy.javajigi_inflearn.calandar.develop5.case1;

public class CalendarDevelop5 {

    private static final int[] MAX_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year){
        if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static int getMaxDaysOfMonth(int year, int month){
        if(isLeapYear(year)){
            return LEAP_MAX_DAYS[month];
        }
        else {
            return MAX_DAYS[month];
        }
    }

    public static int getWeekDay(int year, int month, int day){

        int syear = 1970;
        final int STANDARD_WEEKDAY = 4; // 1970.01.01 Thursday

        int count = 0;

        for(int i = syear; i < year; i++){
            int delta = isLeapYear(i) ? 366 :365;
            count += delta;
        }
        for(int i = 1; i < month; i++){
            int delta = getMaxDaysOfMonth(year, i);
            count += delta;
        }

        count += day -1;

        int weekday = (count + STANDARD_WEEKDAY) % 7;

        return weekday;
    }

    public static void printCalendar(int year, int month){
        System.out.printf("     <<%4d년 %3d월>>\n", year, month);
        System.out.println("  SU  MO  TU  WE  TH  FR  SA");
        System.out.println("==============================");

        int weekday = getWeekDay(year, month, 1);

        for(int i = 0; i < weekday; i++){
            System.out.print("    ");
        }

        int maxday = getMaxDaysOfMonth(year, month);
        int count = 7 - weekday;
        int delim = (count < 7) ? count : 0;

        for(int i = 1; i <= count; i++){
            System.out.printf("%4d", i);
        }
        System.out.println();

        for(int j = count + 1; j <= maxday; j++){
            System.out.printf("%4d", j);
            if(j % 7 == delim){
                System.out.println();
            }
        }
        System.out.println();
    }

}
