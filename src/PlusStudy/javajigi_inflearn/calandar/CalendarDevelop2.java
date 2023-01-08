package PlusStudy.javajigi_inflearn.calandar;

import java.util.Scanner;

public class CalendarDevelop2 {
    private final static int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getMaxDaysOfMonth(int month){
        return MAX_DAYS[month-1];
    }

    public static void main(String[] args) {

        // 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        String PROMPT = "cal> ";
        Scanner sc = new Scanner(System.in);
       // Calendar cal = new Calendar();

        while(true){
            System.out.println("달을 입력하세요");
            System.out.print(PROMPT);
            int month = sc.nextInt();
            if(month == -1){
                System.out.println("Have a nice day!");
                break;
            }
            if(12>month){
                continue;
            }
            System.out.printf("%d월은 %d일까지 있습니다.\n", month, getMaxDaysOfMonth(month));
        }
        System.out.println("BYE!");
        sc.close();
    }
}
