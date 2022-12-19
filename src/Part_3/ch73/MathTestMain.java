package Part_3.ch73;
public class MathTestMain {
    public static void main(String[] args) {
        //constant
        System.out.println("Math.E" + Math.E);
        System.out.println("Math.PI" + Math.PI);
        // method
        System.out.println("Math.abs(-5) 절댓값 : " + Math.abs(-5));
        System.out.println("Math.ceil(4.34) 올림 : " + Math.ceil(4.34));
        System.out.println("Math.round(4.34) 반올림 : " + Math.round(4.34));
        System.out.println("Math.floor(4.34) 버림 : " + Math.floor(4.34));
        System.out.println("Math.rint(4.34) 반올림 : " + Math.rint(4.51));
        System.out.println("Math.max(45,78)" + Math.max(45,78));
        System.out.println("Math.min(45,78)" + Math.min(45,78));
        System.out.println("Math.pow(2,4)" + Math.pow(2,4));
        System.out.println("Math.log(30)" + Math.log(30));
        System.out.println("Math.exp(3)" + Math.exp(3));
        System.out.println("Math.sprt(10)" + Math.sqrt(10));
        //Random
        double dRan = Math.random(); // 0 <== dRan <1 실수
        System.out.println("Math.random() => " + dRan);
    }
}

/*
Math 클래스는 수학 연산에 관련된 메서드를 제공한다. java.lang 패키지에서 Math 클래스의 메서드는 모두 static 메서드 이다.
static 메서드는 객체 생성 없이 "클래스 이름.메서드()" 형태로 사용한다.

9-12: 올림(ceil), 반올림(round), 버림(floor), 반올림(rint)을 구한다. round 의 리턴 타입은 int 타입이며, rint 는 double 이다.
       round 는 0.5부터 반올림이 되지만, rint 는 0.51처럼 0.5 가 넘어야 반올림이 된다.

15 : 승수를 구한다. pow(2,4)는 2의 4승, 즉 2*2*2*2 를 구한다.
16 : 밑수가 Math.E 인 로그이다.
17: exp(num)는 pow(Math.E, num)로 자연 지수의 승수이다.
18 : 양의 제곱근을 구한다.


 */
