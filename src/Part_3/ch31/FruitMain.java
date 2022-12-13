package Part_3.ch31;

// 학습 내용 : 상수의 묶음 클래스인 enum 을 학습하기
// 힌트 내용 : class 키워드 대신 enum 키워드 사용
// 상수의 묶음

public class FruitMain {
    public static void main(String[] args) {

        FRUIT pear = FRUIT.APPLE;
        FRUIT pear2 = FRUIT.MANGO;
        System.out.println(pear);
        System.out.println(pear.name());
        System.out.println(pear.ordinal());
        System.out.println(pear2.ordinal());
        FRUIT[] fruits = FRUIT.values();
        System.out.println(fruits[0]);


    }
}
