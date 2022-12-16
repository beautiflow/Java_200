package Part_3.ch62;

public class FormatTryCatch {
    public static void main(String[] args){

        String sNum = "123";
        String nNum = "h";

        try {
            int a = Integer.parseInt(sNum);
            System.out.println(a);
        }catch (NumberFormatException ee){
            System.out.println("int 인지 확인해봐!");
            System.out.println(ee.getMessage());
        }catch (Exception ee){
            System.out.println("다시 입력하자.");
        }finally {
            System.out.println("난 수행되어야만 해!");
        }
    }
}
