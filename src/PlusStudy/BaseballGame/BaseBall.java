package PlusStudy.BaseballGame;

import java.util.Scanner;

public class BaseBall {
    public static void main(String[] args) {

        String answer = "Y";
        while (answer.equals("Y")){  // answer가 Y인 경우 동작(제일 밑부분에서 게임 재도전 여부에서도 쓰임)
            System.out.println("숫자 야구게임을 시작합니다.");

            int arr[] = new int[3]; // 랜덤한 값을 넣기 위한 배열(컴퓨터 값)
            int arrus[] = new int[3]; // 사용자 입력값의 각 자리 숫자를 넣기위한 배열

            // 랜덤한 숫자 생성(Math.random()이용)
            for(int i = 0; i < arr.length; i++){
                double rand = Math.random();
                arr[i] = (int)(rand * 10);
                if(arr[0] == 0){
                    arr[0] = (int)(rand * 10); // 제일 앞자리 숫자가 0이 나오지 않도록 함
                }
            }

//             랜덤한 숫자 확인

              for(int i = 0; i < arr.length; i++){
                  System.out.print(arr[i]);
              }
              System.out.println();


            int strikeshow = 0 ; // 스트라이크 수
            int ballshow = 0; // 볼 수
            int outshow = 0; // 아웃 수
            int out = 0; // 3아웃이 되었을 때 gameover 이 될 수 있도록 함

            Scanner sc = new Scanner(System.in);

            while (true){
                System.out.println("세 자리 숫자를 입력하세요.");
                // int 로 사용자의 값을 입력받을 수 있지만 String 형으로 입력받아
                // 사용자 입력 값이 세자리가 아닌 경우 다시 입력할 수 있도록 하였고
                // chatAt() 을 이용해서 사용자의 입력값의 자릿수와 랜덤한 숫자를 비교함.
                String usernum;
                while (true){
                    usernum = sc.nextLine();
                    if(usernum.length() != 3){
                        System.out.println("다시 입력해주세요.");
                    }
                    else{
                        break;
                    }
                }

                for(int i = 0; i < arrus.length; i++){ // 사용자 입력값의 자릿수를 배열에 저장함.
                    arrus[i] = usernum.charAt(i)-48;  // charAt()은 char 형이기 때문에 48을 뺴줘야 한다.
                }

                for(int i = 0; i < arrus.length; i++){
                    for(int j = 0; j < arrus.length; j++){
                        if(arr[i] == arrus[j]){ // 컴퓨터 값과 사용자 입력값의 각 자릿수를 비교(겹치는 숫자 확인)
                            if(i == j){ // 숫자와 자리 모두 일치하면 strikeshow 를 1 증가
                                strikeshow++;
                            }
                            else {  // 숫자만 일치하면 ballshow 를 1 증가
                                ballshow++;
                            }
                        }
                    }
                }
                if(strikeshow == 0 && ballshow == 0){ // strikeshow 와 ballshow 가 0이면 겹치는 숫자가 없다는 뜻 (out 1 증가)
                    out++;
                    outshow++;
                }

                System.out.println(strikeshow + "스트라이크");
                System.out.println(ballshow + "볼");
                System.out.println(outshow + "아웃");

                if(out == 3){
                    System.out.println("3 out! Game Over");
                    break;
                }

                if(strikeshow == 3){
                    System.out.println("3 strike! You Win!");
                    break;
                }

                // out 은 누적되어야 하기 때문에 0으로 초기화 하지 않는다. (3 Out 일 때, gameover 하기 위함 )
                // strikeshow, ballshow 는 사용자의 입력에 따라 달라져야 하기 때문에 0으로 초기화
                strikeshow = 0;
                ballshow = 0;
            }

            //게임이 끝났을 때 재도전 여부를 물음
            System.out.println("다시 하시겠습니까? ( [Y] / [N] )");
            answer = sc.nextLine();
        }
        System.out.println("BYE~");
    }
}




// 참고 블로그 : https://m.blog.naver.com/rnreejr46/221934280151