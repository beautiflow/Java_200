package Part_3.ch52;

public class BitNShiftMain {
    public static int BITMASK = 1;
    // 10진법 수를 2진수 스트링으로 변환
    public static String shift(int a){
        int BITMASK = 1;
        String s = "";
        for(int i = 0; i<= 31; i++){
            s = (a & BITMASK)+s;
            a>>=1;                  //a/=2;
        }
        return s.substring(s.indexOf('1'));
    }

    public static void main(String[] args) {
        int intNums1 = 123;
        int intNums2 = -123;
        System.out.printf("%d : %s%n", intNums1, shift(intNums1));
        System.out.printf("%d : %s%n", intNums2, shift(intNums2));
    }
}
