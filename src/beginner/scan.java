package beginner;

import java.util.Locale;
import java.util.Scanner;

public class scan {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //klaviaturadan kiritishni english qilish, shunda float tipini nuqta bn kiritsa ham oladi

        System.out.println("sonni kiriting!");
        Scanner scanner = new Scanner(System.in);

//        int raqam = scanner.nextInt();
        float fl = scanner.nextFloat();

        System.out.printf("%.2f",fl); //formatlash
//        System.out.println("Siz kiritgan raqam "+fl+" ga teng.");
    }
}
