package masalalar;

import java.util.Scanner;

public class boolean21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Uch xonali son kiriting!  n= ");
        int n = scanner.nextInt();

        int a = n%10;
        n/=10;
        int b = n%10;
        n/=10;

        boolean ans = (a>b)&&(b>n);
        System.out.println(ans);
    }
}
