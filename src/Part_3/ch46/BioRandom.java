package Part_3.ch46;

public class BioRandom {
    public static void main(String[] args) {
        int range = 10;
        int start = 1;
        int a = 0, b = 0, c = 0;
        while(true){
            a = (int)(range*Math.random()+start);
            b = (int)(range*Math.random()+start);
            c = (int)(range*Math.random()+start);
            if(a!=b && b!=c && a!=c) break;
        }
        System.out.printf("%d\t%d\t%d",a,b,c);
    }
}


/*
랜덤 함수는 기본형이 Double 형이기에 (int) 로 정수화 시켜주어야 한다.
그리고 1부터의 값을 뽑고 싶다면 랜덤함수는 0부터 나오기 때문에 +1을 꼭 시켜주는 것이다.
 */
