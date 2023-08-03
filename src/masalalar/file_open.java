package masalalar;

import java.util.Formatter;

public class file_open {
    public static void main(String[] args) {
        final Formatter file;

        try{
            file = new Formatter("D:\\java.txt"); //doc/docx/ppt/xlsx/....
            System.out.println("OK...");
        }catch (Exception a){
            System.out.println("xxxxx.....");
        }
    }
}
