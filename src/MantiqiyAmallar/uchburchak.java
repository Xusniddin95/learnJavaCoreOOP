package MantiqiyAmallar;

import java.util.Scanner;

public class uchburchak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("uchburchak tomonlarini kiriting!");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean A = (a+b)>c;
        boolean B = (b+c)>a;
        boolean C = (a+c)>b;

        boolean bool = A && B && C;

        System.out.println(bool);
    }
}
