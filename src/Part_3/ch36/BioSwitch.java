package Part_3.ch36;

public class BioSwitch {
    // 조건에 따라 신체, 감정, 지성값을 출력
    public static String textInfor(int index, double value){
        String result = "";
        switch (index){
            case 23 : result = "신체지수 : ";
            break;
            case 28 : result = "감정지수 : ";
            break;
            case 33 : result = "지성지수 : ";
            break;
        }
        return result + (value*100);
    }

    public static void main(String[] args) {
        int index = 23;
        double value = 0.86;
        String st = textInfor(index, value);
        System.out.println(st);
    }
}
