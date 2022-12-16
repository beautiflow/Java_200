package Part_3.ch55;

public class ForEachLotto {
    public static void print(int ... mm){
        for(int m : mm){
            System.out.print(m + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] mm = {1,6,16,22,23,33};
        print(mm); // 배열도 되고
        int a = 1, b = 6, c = 16;
        print(a);
        print(a,b);
        print(a,b,c);
    }
}
