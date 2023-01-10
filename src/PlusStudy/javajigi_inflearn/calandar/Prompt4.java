package PlusStudy.javajigi_inflearn.calandar;

import java.util.Scanner;

public class Prompt4 {

    // week : 요일명
    public int parseDay(String week){
        if(week.equals("SU")) return 0;
        else if(week.equals("MO")) return 1;
        else if(week.equals("TU")) return 2;
        else if(week.equals("WE")) return 3;
        else if(week.equals("TH")) return 4;
        else if(week.equals("FR")) return 5;
        else if(week.equals("SA")) return 6;
        else return 0;
    }

    public void runPrompt(){
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new Calendar();

        int month = 1;
        int year = 2023;
        int weekday = 0;

        while (true){
            System.out.println("년도를 입력하세요. (exit: -1)");
            System.out.println("YEAR> ");
            year = sc.nextInt();
            if(year == -1)
                break;

            System.out.println("월을 입력하세요");
            System.out.println("MONTH> ");
            month = sc.nextInt();
            System.out.println("첫번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
            String str_weekday = sc.next();
            weekday = parseDay(str_weekday);


            if(month > 12|| month < 1){
                System.out.println("잘못된 입력입니다.");
                continue;
            }else {
                CalendarDevelop4.printCalendar(year, month, weekday);

                System.out.println(" ");
            }
        }
        System.out.println("BYE!");
        sc.close();
    }

    public static void main(String[] args) {

        Prompt4 p = new Prompt4();
        p.runPrompt();
    }
}
