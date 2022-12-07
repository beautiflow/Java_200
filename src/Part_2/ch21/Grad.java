package Part_2.ch21;

// 정수 배열

public class Grad {
    public static void main(String[] args) {

        int[] grade = {90,80,89};
        int total = grade[0] + grade[1] + grade[2];
        int average = total/3; // 정수 연산은 정수
        System.out.printf("국어 %d점, 영어 %d점, 수학 %d점 => \t", grade[0], grade[1], grade[2]);
        System.out.printf("총점 %d점, 평균 %d점 \n", total, average);
    }
}
