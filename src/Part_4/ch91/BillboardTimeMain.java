package Part_4.ch91;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class BillboardTimeMain {
    public static void main(String[] args) {
        String newUrls = "https://www.billboard.com/charts/hot-100/";
        String s = "";
        URL url = null;
        try{
            url = new URL(newUrls); // 주소 찾기
            // 주소지에 빨대 꽂기
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"),8);
            String line = "";
            while ((line = reader.readLine())!=null){
                if(!line.trim().equals("")){
                   // <time datetime = "2018-08-13">August 13,2018</time>
                    if(line.trim().contains("<time datetime = ")){
                        s = line.trim();
                        s = s.substring(0,s.indexOf(">")-1); // <time datetime = "2018-08-13">
                        s = s.substring(s.indexOf("\"")+1).trim(); // 2018-08-13
                        break;
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Billboard Parsing error !!!");
        }
        System.out.println("이번 빌보드 차트 날짜 : " + s);
    }
}
