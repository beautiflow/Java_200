package Part_2.ch18;

// 타입 변환의 필요성
public class JavaTypeConversion {
    public static void main(String[] args) {

        String slat = "  37.52127220511242   ";

        // String slat = "hello";
        // 공백 제거 후 double 로 타입 변환
        double latitude = Double.parseDouble(slat.trim());
        System.out.println(latitude);
    }
}

/*
trim() 은 양쪽 공백을 제거하여 "37.52127220511242"로 만든다.
Double 랩퍼 클래스를 이용하여 37.52127220511242로 타입 변환한다.
 */
