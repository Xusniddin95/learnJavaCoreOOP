package Switch_Case;

import java.util.Scanner;

public class While_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Son kiriting: ");

        int n = scanner.nextInt();


        label:
        while (true){
            System.out.print("Dasturdan chiqishni xohlaysizmi: y/n: ");

            String ans = scanner.next();

            switch (ans){
                case "y":
                    System.out.println("Siz kiritgan son "+n+ " ga teng");
                    break label;
                case "n":
                    System.out.print("Son kiriting: ");
                    n = scanner.nextInt();
                    break;
            }
        }
    }
}
