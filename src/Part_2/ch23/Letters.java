package Part_2.ch23;

// 학습 내용 : 애국가에서 '닳'이 몇 번째에 있는지 구해보기
// 힌트 내용 : 문자열의 위치를 찾는 메서드를 사용하기
// char, escape

public class Letters {
    public static void main(String[] args) {

        char a = '닳';
        String letter = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
        int letterNumber = letter.length();
        int loc = letter.indexOf(a);

        System.out.printf("\"%s\"=>%d자이며, '%c'은 %d번째 있다.\n",
                letter, letterNumber,a,loc);

        char b = letter.charAt(loc);
        System.out.printf("\"%s\"의 %d번째 문자는 '%c'이다.", letter,loc,b);
    }
    }

/*
5~6 : 한 개의 문자를 ''로 감싼다. 문자열은 한 개 이상의 문자로 구성된다.
7~8: 문자열의 길이를 구하고, '닳'의 위치를 구한다.
9 : %s는 문자열, %c는 문자, %d는 정수를 의미한다.
11 : 13라인에서 구한 "닳"의 위치는 15이다. charAt(15)는 "닳"을 반환한다.
 */
