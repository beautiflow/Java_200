package Part_4.ch88;

import java.io.BufferedReader;
import java.io.File;  // => 파일에 관련된 클래스와 정보를 제공. File 클래스에 입력된 이름이 디렉토리인지 확인하고,
                      //     디렉토리 않에 있는 파일을 찾을 수 있고, 파일이름, 파일 절대 경로 이름, 작성일 또는 수정일 등을 확인할 수 있다.
import java.io.FileReader;
import java.util.Date;

public class BillFiles {
    public static void main(String[] args) {
        File f = new File("billboard");  //billboard 디렉토리
        File[] fd = f.listFiles();  // 바로 아래 파일들(자식 파일 )
        for (File ff : fd){
            String fname = ff.getName();  // 파일명
            String post = fname.substring(fname.lastIndexOf(".")+1);
            System.out.println(fname+" "+post);  // 이름, 확장자
            System.out.println(ff.getAbsolutePath());  // 전체 경로
            System.out.println(new Date(ff.lastModified())); // 수정일
            try(BufferedReader br = new BufferedReader(new FileReader(ff.getAbsolutePath()))){
                String msg = "";
                while ((msg = br.readLine())!=null){
                    System.out.println(msg);
                }
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("---------------------------------");
        }
    }
}
