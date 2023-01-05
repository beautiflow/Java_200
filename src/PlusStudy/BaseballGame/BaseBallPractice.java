package PlusStudy.BaseballGame;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class BaseBallPractice {
    public static void main(String[] args) {

        String answer = "Y";

        while(answer.equals("Y")){
            System.out.println("야구 게임을 시작합니다.");

            int arr[] = new int[3];
            int arruser[] = new int[3];

            for(int i = 0; i < arr.length; i++){
                double rand = Math.random();
                arr[i] = (int)(rand * 10);
                if(arr[0] == 0){
                    arr[0] = (int)(rand * 10);
                }
            }

            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i]);
            }
            System.out.println();

            int strikeshow = 0;
            int ballshow = 0;
            int outshow = 0;
            int out = 0;

            Scanner sc = new Scanner(System.in);

            while (true){
                System.out.println("세자리 숫자를 입력하세요.");

                String usernum;
                while (true){
                     usernum = sc.nextLine();
                     if(usernum.length() != 3){
                         System.out.println("다시 입력해주세요");
                     }
                     else {
                         break;
                     }
                }
                for(int i = 0; i < arruser.length; i++){
                    arruser[i] = usernum.charAt(i) - 48;
                }

                for(int i = 0; i< arruser.length; i++){
                    for(int j = 0; j < arruser.length; j++){
                        if(arr[i] == arruser[j]){
                            if(i == j){
                                strikeshow++;
                            }
                            else {
                                ballshow++;
                            }
                        }

                    }
                }
                if(strikeshow == 0 && ballshow == 0){
                    out++;
                    outshow++;
                }
                System.out.println(strikeshow + "스트라이크");
                System.out.println(ballshow + "볼");
                System.out.println(outshow + "아웃");

                if(out == 3){
                    System.out.println("3 OUT! GAME OVER!");
                    break;
                }
                if (strikeshow == 3){
                    System.out.println("3 STRIKE! YOU WIN!");
                    break;
                }

                strikeshow = 0;
                ballshow = 0;
            }
            System.out.println("다시 하시겠습니까? ( [ Y ] / [ N ])");
            answer = sc.nextLine();
        }
        System.out.println("BYE~");
    }

}
