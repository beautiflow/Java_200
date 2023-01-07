package PlusStudy.javajigi_inflearn.gugudanFinal;

import java.util.Scanner;

public class Final_Develop {

    public static int[] calculate(int number){
        int[] times = new int[19];
        for(int i = 0; i <= (number-1); i++){
                times[i] = number * (i+1);
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();

            System.out.println( N +"단");
            int[] times = calculate(N);

            for(int M = 1; M <= N; M++) {
                System.out.println(N + " X " + M + " = " + times[M-1]);
            }
    }

}
