package PlusStudy.javajigi_inflearn.calandar;

import java.util.Scanner;

public class CalendarDevelop3 {

    public static void getMonth(int month){

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("SUN  MOM  TUE  WED  THU  FRI  SAT");
                System.out.println("----------------------------------");
                System.out.println("  1    2    3    4    5    6    7");
                System.out.println("  8    9   10   11   12   13   14");
                System.out.println(" 15   16   17   18   19   20   21");
                System.out.println(" 22   23   24   25   26   27   28");
                System.out.println(" 29   30   31");
                break;

            case 2:
                System.out.println("SUN  MOM  TUE  WED  THU  FRI  SAT");
                System.out.println("----------------------------------");
                System.out.println("  1    2    3    4    5    6    7");
                System.out.println("  8    9   10   11   12   13   14");
                System.out.println(" 15   16   17   18   19   20   21");
                System.out.println(" 22   23   24   25   26   27   28");
                break;

            case 4: case 6: case 9: case 11:
                System.out.println("SUN  MOM  TUE  WED  THU  FRI  SAT");
                System.out.println("----------------------------------");
                System.out.println("  1    2    3    4    5    6    7");
                System.out.println("  8    9   10   11   12   13   14");
                System.out.println(" 15   16   17   18   19   20   21");
                System.out.println(" 22   23   24   25   26   27   28");
                System.out.println(" 29   30");
                break;
        }
    }

    public static void main(String[] args) {

        String PROMPT = "cal> ";
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("달을 입력하세요");
            System.out.println(PROMPT);
            int month = sc.nextInt();
            if(month == -1){
                System.out.println("Bye!");
                break;
            }
            getMonth(month);
        }
    }
}
