package Part_3.ch51;

public class BitNShiftMain {
    public static int BITMASK = 1;
    // 10 진수를 2진수 문자열(스트링)로 변환
    public static String shifts(int a){
        int BITMASK = 1;
        String s = "";
        for(int i = 0; i <=31 ; i++){
            s = (a & BITMASK)+s;
            a>>=1;                   // a/=2;
        }
        return s;
    }

    public static void main(String[] args) {
        int intNums1 = 123;
        int intNums2 = -123;
        System.out.printf("%d : %s%n", intNums1, shifts(intNums1));
        System.out.printf("%d : %s%n", intNums2, shifts(intNums2));
    }
}
