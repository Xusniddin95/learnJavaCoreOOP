package masalalar;

import java.util.Scanner;

public class bolinuvchilari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k=0;
        for (int i=2; i<=n; i++){
            if(n%i==0) {
                System.out.print(i + " ");
                k++;
            }
        }
        System.out.println("\n Bolinuvchilari soni " + k +" ta");
    }
}
