package PlusStudy.javajigi_inflearn.calandar.calendardevelop3answer;

import PlusStudy.javajigi_inflearn.calandar.Calendar1;

import java.util.Scanner;

public class Prompt {

    private final static String PROMPT = "cal> ";

    public void runPrompt(){
        String PROMPT = "cal> ";
        Scanner sc = new Scanner(System.in);
        Calendar1 cal = new Calendar1();

        int month = 1;

        while(true){
            System.out.println("달을 입력하세요");
            System.out.print(PROMPT);
            month = sc.nextInt();
            if(month == -1){
                break;
            }
            if(month>12){
                continue;
            }
            CalendarDevelop3_answer.printCalendar(2017, month);
        }
        System.out.println("BYE!");
        sc.close();
    }

    public static void main(String[] args) {

        Prompt p = new Prompt();
        p.runPrompt();
    }
}
