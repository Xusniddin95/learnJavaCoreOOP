package masalalar;

import java.io.File;
import java.util.Scanner;

public class read_file1 {
    public static void main(String[] args) throws Exception {
        File file = new File("D://test.pdf");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            System.out.print(scanner.nextInt() + " ");
        }
    }
}
