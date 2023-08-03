package masalalar;

import java.util.Scanner;

public class tub_son {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Son kiriting:  n= ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j){
                    System.out.print(i+ " ");
                }
                if (i % j == 0){
                    break;
                }
            }

        }
    }
}
