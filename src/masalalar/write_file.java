package masalalar;

import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

public class write_file {
    public static void main(String[] args) {
         Fayl file = new Fayl();
         file.open();
         file.write();
         file.closing();
    }
}

class Fayl{
    private Formatter f;

    void open(){
        try{
            f = new Formatter("D://test.pdf");
            System.out.println("OK....");
        }catch (Exception a){
            System.out.println("xato...");
        }
    }

    void write(){
//        f.format("Faylga malumot yozish");
//        f.format(String.valueOf(10*10));

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Massiv uzunligini kiriting: n= ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(300);
            System.out.print(a[i]+" ");
        }

//        int max = a[0];

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Saralangan massiv:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " " );
        }

        for (int i = 0; i < n; i++) {
            f.format(a[i]+ " ");      //faylga yozish
        }

    }


    void closing(){
        f.close();
    }
}
