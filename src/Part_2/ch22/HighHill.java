package Part_2.ch22;

// 실수 변수, 연산

public class HighHill {
    public static void main(String[] args) {
        double S = 6; // 6 영국 신발 사이즈 -> 255mm
        double P = 0.75; // 75% 히트할 확률
        double L = 200; // 200 파운드 -> 1,787원 / 1파운드
        double T = 0; // 0년(올해 유행) 1년전 유행
        double A = 1; // 음주량 0잔 -> 8.83cm 1잔 -> 4.42cm
        double Y = 2; // 착용년도

        double ups1 = P*L*(Y+9);
        double downs = (T+1)*(A+1)*(Y+10)*(L+20);
        double ups2 = 12+3*S/8.0;
        double high = ups1 /downs * ups2; // 밝혀낸 식

        System.out.printf("적당한 하이힐 높이는 %1$.2fcm입니다.", high);
    }
}

/*
%1$ : 첫 번째 변수 high 를 1$ 위치에 대입하라는 의미이다.
%f 는 실수, %.2f 는 소수점(.) 두 자리 까지만 표시한다는 의미이다.
 */
