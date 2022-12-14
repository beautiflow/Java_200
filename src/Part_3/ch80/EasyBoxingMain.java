package Part_3.ch80;

import java.util.ArrayList;

public class EasyBoxingMain {
    public static void main(String[] args) {
        int intNm1 = 123;
        long longNum1 = 345L;
        double doubleNum = 123.123;
        Integer intWrap1 = intNm1;   // new Integer(intNm1);
        Long longWrap1 = longNum1;    // new Long(longNum1);
        Double doubleWrap1 = doubleNum; // new Double(longNum1);
        double dd = doubleWrap1;
        //  기본 타입 <--> Wrapper 는 캐스팅 없이 사용
        Integer intWrap2 = intNm1; // Boxing
        intNm1 = intWrap2; // UnBoxing
        System.out.println(intNm1);

        ArrayList<Integer> ilist = new ArrayList<>();
        ilist.add(new Integer(3));
        ilist.add(5);
        int a = ilist.get(0);  //<Integer>
        System.out.println(a);

        int b = Integer.parseInt("123");
        System.out.println(b);

    }
}
