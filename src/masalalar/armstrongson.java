package masalalar;

import java.util.Scanner;

public class armstrongson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Son kiriting!  n= ");
        int n = scanner.nextInt();
        int s = 0;
        int k=0;
        int m=n;
        while(n>0){
            n = n/10;
            k++;
        }
        n=m;
        System.out.println("Kiritilgan son " + k + " xonali");
        while(m>0){
            int a=m%10;
            m/=10;
            s+=Math.pow(a,k);
        }
        if (s==n){
            System.out.println(s + " -> Armstrong son!");
        }else{
            System.out.println(s + " ->xato");
        }


    }
}
