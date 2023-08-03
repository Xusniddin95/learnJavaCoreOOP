package MantiqiyAmallar;

import java.util.Scanner;

public class bool1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        boolean bool = A>0;
        System.out.println("A>0 ni tekshirish:");
        System.out.println(bool);

        int B = scanner.nextInt();
        int C = scanner.nextInt();
        boolean bool1 = (A<=B)&&(B<=C);
        System.out.println("A<=B<=C ni tekshirish:");
        System.out.println(bool1);
    }
}
