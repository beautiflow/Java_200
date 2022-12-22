package Part_3.ch75;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
public class RestDay {
    public static void main(String[] args) {
        String st = "2017-06-13";
        Calendar d2 = todate(st);
        System.out.println(toYMD(d2));
        String st2 = goGo(st, -7);
        System.out.println(st2);
        Calendar d3 = todate(st2);
        System.out.println(toYMD(d3));

        TimeZone tz = TimeZone.getDefault();   // Asia / Seoul 현재 컴퓨터의 시간존
        Calendar cal = Calendar.getInstance(tz);  // 타임존에 대한 오늘
        System.out.println(toYMD2(cal));

        //America / New_York
        TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
        Calendar calNY = Calendar.getInstance(tzNY);
        System.out.println(toYMD2(calNY));
    }

    public static Calendar todate(String ss) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dd = new Date();
        try {
            dd = sdf.parse(ss);
        }catch (ParseException e){}
        Calendar cal = Calendar.getInstance();
        cal.setTime(dd);
        return cal;
    }

    public static String toYMD(Calendar dd) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(dd.getTime());
    }

    private static String  toYMD2(Calendar dd) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(dd.getTime());
    }

    public static String goGo(String ss, int day) {
        Calendar cal = todate(ss);
        // -7일을 더하면 일주전
        cal.add(Calendar.DAY_OF_YEAR, day);
        // 캘린더를 문자열로
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
    }


    public static String toWantedDay(String ss,int round){
        Calendar cal=todate(ss);
        //-7일을 더하면 일주전
        cal.add(Calendar.DAY_OF_YEAR, -(round*7));
        //칼렌더를 문자열로
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
    }
}


/*
String, long(경과 시간 밀리세컨드), Date, Calendar 사이의 변환은 많이 사요되므로 잘 익혀 놓자.

1. String 과 Date 변환 : SimpleDateFormat 클래스를 이용한다. SimpleDateFormat("yyyy-MM-dd HH:mm:ss")에서
                       "yyyy"년도, "MM" 월, "dd" 일, "HH" 24시간 단위 시간(hh 12 시간 단위 시간), "mm"분,
                       "ss" 초를 이용하여 원하는 변환 형태를 설정한다.

2. long 과 Date 변환 : Date 생성자 (Date(long)) 또는 메서드(setTime(long)) 를 사용해 경과 시간을 대입하여
                     원하는 날짜로 변경한다.

3. Date 와 Calendar 변환 : setTime(java.util.Date)을 사용해 Date 를 Calendar 에 대입하여 원하는 날짜로
                          변경한다. getTime()으로 Date를 얻는다.

 */
