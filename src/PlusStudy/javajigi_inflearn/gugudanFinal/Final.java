package PlusStudy.javajigi_inflearn.gugudanFinal;

public class Final {

    public static int[] calculate(int times) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            System.out.println( i +"단");

            int[] result = calculate(i);
            print(result);
            System.out.println();
        }
    }
}


///