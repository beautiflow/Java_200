package Part_2.ch20;

// 정수 변수, 연산

public class Grad {
    public static void main(String[] args) {

        int kor = 90;
        int eng = 80;
        int math = 89;
        int total = kor + eng + math;  // 259
        int average = total/3;  // 정수 연산은 정수 86.3333 -> 86

        System.out.printf("국어%d점, 영어%d점, 수학%d점 => \t", kor,eng,math);
        System.out.printf("총점%d점, 평균%d점 \n", total, average);
    }
}

/*
Syntax
=> System.out.printf(format, arguments)

# 지시자들
%n : 줄바꿈
%s : String 형식으로 출력
%d : integer 형식으로 출력
%f : float 형식으로 출력
%t : date, time 형식으로 출력
%o : 8진수 integer 형식으로 출력
%x : 16진수 integer 형식으로 출력
%b :boolean 형식으로 출력
%e : 지수형식으로 출력
 */
