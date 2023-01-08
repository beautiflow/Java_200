package PlusStudy.javajigi_inflearn.calandar;

import java.util.Scanner;

public class CalendarDevelop1 {

    private final static int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getMaxDaysOfMonth(int month){
        return MAX_DAYS[month-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Calendar cal = new Calendar();
        System.out.println("반복횟수를 입력하세요.");

        int C = sc.nextInt();

        System.out.println("월을 입력하세요.");

        int[] arr = new int[C];

        for(int i = 0; i < C; i++) {
            int month = sc.nextInt();
            arr[i] = month;
        }

        for(int i = 0; i < C; i++){
            System.out.printf("%d월은 " + getMaxDaysOfMonth(arr[i]) + "일까지 있습니다.\n", arr[i]);
        }

//        String[] splitValue = month.split(",");
//
//        int first = Integer.parseInt(splitValue[0]);
//        int second = Integer.parseInt(splitValue[1]);
//        int third = Integer.parseInt(splitValue[2]);
//
//        System.out.println(first + "월");
//        int[] month = MAX_DAYS[first];

    //    System.out.printf("%d월은 %d일까지 있습니다.\n", first, cal.getMaxDaysOfMonth(first));



    }
}
