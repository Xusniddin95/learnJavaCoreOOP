package masalalar;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class read_file2 {
    public static void main(String[] args) {
        FILE file = new FILE();
        file.open();
        file.reading();
//        file.writing();
//        file.reading();
        file.closing();
    }
}

class FILE{
    private Formatter format;
    private Scanner z;
    private String l;
    void open(){
        try{
            z = new Scanner(new File("D://test.txt"));
        }
        catch (Exception a){
            System.out.println("xatolik...");
        }
    }

    void reading(){

        while (z.hasNext()){
            l = z.nextLine();
            System.out.println(l);
        }
    }

    void writing(){
        try{
            format = new Formatter("D://test.txt");
            System.out.println("ok..");
        }catch (Exception ss){
            System.out.println("xatolik..");
        }

        format.format(z.nextLine().toUpperCase());
    }
    void closing(){
        z.close();
    }


}
