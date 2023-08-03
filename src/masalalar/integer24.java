package masalalar;

import java.util.Scanner;

public class integer24 {
    public static void main(String[] args) {
        System.out.println("0. Yakshanba");
        System.out.println("1. Dushanba");
        System.out.println("2. Seshanba");
        System.out.println("3. Chorshanba");
        System.out.println("4. Payshanba");
        System.out.println("5. Juma");
        System.out.println("6. Shanba");

        Scanner scanner = new Scanner(System.in);

        System.out.println("1-Yanvar Dushanba !");
        System.out.print("1-365 oraliqda son kiriting -> K= ");
        int k = scanner.nextInt();

        int n = k%7;

        switch (n){
            case 1:
                System.out.println("Dushanba"); break;
            case 2:
                System.out.println("Seshanba");break;
            case 3:
                System.out.println("Chorshanba");break;
            case 4:
                System.out.println("Payshanba");break;
            case 5:
                System.out.println("Juma"); break;
            case 6:
                System.out.println("Shanba");break;
            default:
                System.out.println("Yakshanba");
        }

    }
}
