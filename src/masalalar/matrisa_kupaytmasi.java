package masalalar;

import java.util.Random;
import java.util.Scanner;

public class matrisa_kupaytmasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("A matrisa satri n= ");
        int n = scanner.nextInt();
        System.out.print("A matrsia ustuni  m= ");
        int m = scanner.nextInt();
        int A[][] = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                A[i][j] = random.nextInt(10);
            }
        }

        System.out.println("A matrisa elementlari:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }


        System.out.print("B matrisa satri k= ");
        int k = scanner.nextInt();
        System.out.print("B matrsia ustuni  l= ");
        int l = scanner.nextInt();
        int B[][] = new int[k][l];
        for (int i = 0; i <k ; i++) {
            for (int j = 0; j <l ; j++) {
                B[i][j] = random.nextInt(10);
            }
        }

        System.out.println("B matrisa elementlari:");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(B[i][j]+ " ");
            }
            System.out.println();
        }
//n=k
//        Matrisalar kupaytmasi:
        int c[][] = new int[20][20];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
               c[i][j] = 0;
                for (int p = 0; p < k; p++) {
                    c[i][j] += A[i][p] * B[p][j];
                }
            }
        }

        System.out.println("Natija:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }



    }
}
