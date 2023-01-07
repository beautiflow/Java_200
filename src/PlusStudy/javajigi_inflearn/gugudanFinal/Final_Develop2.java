package PlusStudy.javajigi_inflearn.gugudanFinal;

import java.util.Scanner;

public class Final_Develop2 {
    public static int[] calculate(int first){
        int[] times = new int[19];
        for(int i = 0; i <= (first-1); i++){
            times[i] = first * (i+1);
        }
        return times;
    }

    public static void print(int[] times){
        for(int i = 0; i < times.length; i++){
            if(times[i] != 0){
                System.out.println(times[i]);
            }else {
                break;
            }
        }
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력하세요.");
        String inputValue = sc.nextLine();

        String[] splitValue = inputValue.split(",");

        int first = Integer.parseInt(splitValue[0]);
        int second = Integer.parseInt(splitValue[1]);


        System.out.println( first +"단");
        int[] times = calculate(first);

        for(int M = 1; M <= second; M++) {
            System.out.println(first + " X " + M + " = " + times[M-1]);
        }
    }
}
