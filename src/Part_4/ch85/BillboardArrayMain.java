package Part_4.ch85;

import Part_4.ch83.Billboard;

import java.util.ArrayList;

public class BillboardArrayMain {
    public static void main(String[] args){
        ArrayList<Billboard> bills = new ArrayList<>();
        bills.add(new Billboard(1,"Despacito", 1,
                "https//www.billboard.com/images/pref_images/q61808osztw.jpg", "luis fonsi"));
        bills.add(new Billboard(2, "That's What I Like", 2,
                "https://www.billboard.com/images/pref_images/q59725qvpol.jpg", "bruno mars"));
        bills.add(new Billboard(3, "I'm The One", 3,
                "https://www.billboard.com/images/pref_images/q6432pl64x.jpg", "dj khaled"));
        System.out.println(bills.size());  // 3
        showAbout(bills.get(0)); // 0번째 Billboard 객체
        bills.remove(1); // 1번째 삭제
        System.out.println(bills.size()); // 2
        System.out.println("-----------------");
        for(Billboard bb : bills ){
            showAbout(bb);
        }
    }
    public static void showAbout(Billboard bb){ // 객체를 전달하여 출력
        String sf = String.format("%d, %s, %d, %s, %s",
                bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
        System.out.println(sf);
        }
    }

