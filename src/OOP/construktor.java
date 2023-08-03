package OOP;

import java.util.Scanner;

public class construktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        Matem matem = new Matem(a,b,c);
        matem.show();
    }
}

class Matem{
    private double a;
    private double b;
    private double c;

    public Matem(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void show(){
        if (a>b){
            if (a>c){
                System.out.println("max = " + a);
            }else {
                System.out.println("max = " + c);
            }
//            System.out.println("a>b");
        }if (a<b){
            if (b>c){
                System.out.println("max = " + b);
            }else {
                System.out.println("max = " + c);
            }
//            System.out.println("a<b");
        }
//        else {
//            System.out.println("a==b");
//        }

    }
}
