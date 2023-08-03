package OOP;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Uchburchakning tomonlarini kiriting:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        hClass ring = new hClass();

        ring.yuza(a,b,c);
    }
}
