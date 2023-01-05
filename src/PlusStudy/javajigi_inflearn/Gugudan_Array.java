package PlusStudy.javajigi_inflearn;

public class Gugudan_Array {
    public static void main(String[] args) {

        System.out.println("2단");
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = 2 * (i + 1);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        System.out.println();

        System.out.println("3단");
        int[] times3 = new int[9];
        for(int i = 0; i < times3.length; i++){
            times3[i] = 3 * (i + 1);
        }
        for(int i = 0; i < times3.length; i++){
            System.out.println(times3[i]);
        }
    }
}