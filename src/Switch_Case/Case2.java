package Switch_Case;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ikki xonali son kiriting  n=");
        int n = scanner.nextInt();

        int a = n/10;
        int b = n%10;

        switch (a){
            case 1:
                System.out.print("o'n ");break;
            case 2:
                System.out.print("Yigirma ");break;
            case 3:
                System.out.print("O'ttiz ");break;
            case 4:
                System.out.print("Qirq ");break;

            default:
                System.out.println("Xato");
        }

        switch (b){
            case 0:
                System.out.println("");break;
            case 1:
                System.out.println("bir");break;
            case 2:
                System.out.println("ikki");break;
            case 3:
                System.out.println("uch");break;
            case 4:
                System.out.println("to'rt");break;

            default:
                System.out.println("xato");
        }

    }
}
