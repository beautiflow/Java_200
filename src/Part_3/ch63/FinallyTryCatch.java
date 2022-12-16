package Part_3.ch63;

public class FinallyTryCatch {
    public static void main(String[] args) {

        try{
            int x = 5;
            int y = 20 / (5 - x);
            System.out.println(y);
        }catch (ArithmeticException e){
            System.out.println("==> 0으로 나누었나 확인하기");
        }finally {
            System.out.println("난 수행되어야만 해!");
        }
    }
}
