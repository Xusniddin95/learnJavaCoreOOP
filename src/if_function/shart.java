package if_function;

import java.util.Locale;
import java.util.Scanner;

public class shart {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

//        Juftlikka tekshirish
        if (a%2==0){
            System.out.println("Juft");
        }else{
            System.out.println("Toq");
        }


//        Polindrom
        int c = a;
        int b = 0;
        while(a>0) {
            b = b * 10 + a % 10;
            a = a / 10;
        }
        System.out.println("b="+b);
        if (c == b)
            System.out.println("Polindrom");
        else
            System.out.println("Polindrom emas");

//
        System.out.println("test");
        System.out.println(-a);
    }
}
