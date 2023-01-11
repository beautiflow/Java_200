package PlusStudy.javajigi_inflearn.calandar.develop5.case1;

import java.util.Scanner;

public class Prompt5 {

    public void runPrompt(){
        Scanner sc = new Scanner(System.in);

        int month = 1;
        int year = 2023;


        while(true){
            System.out.println("년도를 입력하세요. (exit: -1)");
            System.out.println("YEAR> ");
            year = sc.nextInt();
            if(year == 1){
                break;
            }

            System.out.println("월을 입력하세요");
            System.out.println("MONTH> ");
            month = sc.nextInt();

            if(month > 12 || month < 1){
                System.out.println("잘못된 입력입니다. 다시 입력하세요");
                continue;
            }
            else {
                CalendarDevelop5.printCalendar(year, month);

                System.out.println(" ");
            }
        }
        System.out.println("BYE~");
        sc.close();
    }

    public static void main(String[] args) {
        Prompt5 prom = new Prompt5();
        prom.runPrompt();
    }
}
