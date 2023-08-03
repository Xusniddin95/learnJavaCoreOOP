package masalalar;

import java.util.Scanner;

//6 -> 1+2+3 mukammal son
public class mukammalson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n= ");
        int n = scanner.nextInt();
        int s=0;
        for (int i=1; i<n; i++){
            if (n%i==0){
                s+=i;
            }
        }
        if (n==s){
            System.out.println("Kiritilgan son mukammal son");
        }else{
            System.out.println("xato");
        }
    }
}
