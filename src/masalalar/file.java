package masalalar;

import java.io.File;

public class file {
    public static void main(String[] args) {
        File file = new File("D://source.txt");

        if (file.exists()){
            System.out.println(file.getName() + " nomli fayl mavjuda");
        }else {
            System.out.println("Bunday fayl mavjud emas");
        }
    }
}
