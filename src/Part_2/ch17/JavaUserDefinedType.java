package Part_2.ch17;

class JLocation{
    public double lat;
    public double lng;
}

public class JavaUserDefinedType {
    public static void main(String[] args) {

        // 두 개의 기본 타입
        double latitude = 37.52127220511242;
        double longitude = 127.0074462890625;

        // 사용자 정의 객체를 생성
        JLocation jloc = new JLocation();
        jloc.lat = latitude;  // 값을 대입
        jloc.lng = longitude;  // 값을 대입

        JLocation newLoc = jloc; // 객체를 대입
        System.out.println(newLoc.lat);  // 출력
    }
}

/*
기본적으로 한 클래스는 한 파일에 저장하며, 클래스와 파일의 이름이 동일해야 한다.
만약 한 파일에 클래스를 두 개 이상 선언할 때는 파일 이름과 동일한 클래스에만 public 을 붙일 수 있다.
(예제 소스의 파일 이름과 다른 JLocation 은 public 을 붙일 수 없다.)
 */

