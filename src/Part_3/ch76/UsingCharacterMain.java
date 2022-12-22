package Part_3.ch76;

public class UsingCharacterMain {
    public static void main(String[] args) {
        Character chr1 = new Character('W');
        Character chr2 = new Character('9');   // 48 + 9

        if(Character.isLetter(chr1.charValue())){
            System.out.println("1 : " + chr1.charValue()); // 'W'
         }
        System.out.print(" ");
        System.out.print("\u0057");  System.out.println("\t");  // 16 진수 유니코드
        System.out.println(Integer.toHexString((int)chr1)); // 'W' = 87
        System.out.println((int)chr1);  // 87 -> 5 + 16 + 7
        if (Character.isDigit(chr2.charValue())){
            System.out.println("2 : " + (int)chr2.charValue()); // '9' = 48+9
        }

        System.out.println("3 : " + Character.getType('a'));  // 소문자 2
        System.out.println("4 : " + Character.getType('A'));  // 대문자 1
        System.out.println("5 : " + Character.getType('3'));  // 숫자 9
        System.out.println("6 : " + Character.getType('&'));  // 특수문자 24
        // OTHER_PUNCTUATION 24
        System.out.println("7 : " + Character.getType('\n')); // white 15
        System.out.println("8 : " + (int)'\b');  // 8
        // 9~13, 28~31 white space
        System.out.println("9 : " + (int)'\t'); // 9  // white space
        System.out.println("" + (int)'\n');  //10
        System.out.println("" + (int)'\f');  // 12
        System.out.println("" + (int)'\r');  // 13

        System.out.println("" + Character.getNumericValue('9')); // 숫자
        System.out.println("" + Character.isWhitespace(' '));
        System.out.println("" + Character.isWhitespace('\n'));
        System.out.println("" + Character.isWhitespace('\r'));
        System.out.println("" + Character.isWhitespace('\b'));
        System.out.println("" + Character.isLetterOrDigit('9'));
        System.out.println("" + Character.isLowerCase('A'));
        System.out.println("" + Character.isUpperCase('A'));
        // radix 기수 0~9 가 기본
        System.out.println("" + Character.digit('8',9));
        // SPACE_SEPARATOR 12 '\f'
        // LINE_SEPARATOR 13 '\r'
        // PARAGRAPH_SEPARATOR 14
        // SPACE 32
        System.out.println("" + (int)' '); // 32
        System.out.println("" + Character.isSpaceChar(' '));
        System.out.println("" + Character.isSpaceChar('\n'));
    }
}

/*
랩퍼 클래스는 기본 타입을 참조 타입으로 변환하거나, 문자열을 기본 타입으로 변환하는 등 기본 타입 처리에 필요한 메서드를 제공한다.
Character 는 char 에 대한 성격(숫자형인가, 알파벡인가, 공백 문자인가 등)을 확인하거나 숫자형 문자를 숫자로 변환하는 데 사용한다.
char 와 Character 는 서로 자동 변환(박싱/언박싱)할 수 있다.


- 7 : isLetter 는 문자가 입력되면 해당 문자의 문자 여부를 boolean 타입으로 리턴한다.

- 14 : isDigit 은 문자가 입력되면 해당 문자의 숫자(Digit, number) 여부를 boolean 타입으로 리턴한다.

- 18~24 : getType 은 문자가 입력되면 이 문자가 속한 분류를 int 로 리턴한다.
 */
