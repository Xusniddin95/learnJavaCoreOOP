package OOP;

import java.util.Scanner;

public class AbstractClas {
    public static void main(String[] args) {
        System.out.println("1. Rectangle");
        System.out.println("2. Parallelogram");
        Scanner scanner = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        Paralelogram para = new Paralelogram();

        int n = scanner.nextInt();

        if (n==1){
            System.out.println("To'g'ri to'rtburchakning tomonlarini kiriting:");
            System.out.print("a= ");
            rect.a = scanner.nextDouble();
            System.out.print("b= ");
            rect.b = scanner.nextDouble();
            System.out.println();
            System.out.print("Yuza: S= " + rect.yuza());
            System.out.println();
            System.out.print("Perimetr: P= " + rect.perimetr());

        }if (n==2){
            System.out.println("Parallelogram tomonlarini va balandligini kiriting:");
            System.out.print("a= ");
            para.a = scanner.nextDouble();
            System.out.print("b= ");
            para.b = scanner.nextDouble();
            System.out.print("h= ");
            para.h = scanner.nextDouble();
            System.out.println();
            System.out.print("Yuza: S= " + para.yuza());
            System.out.println();
            System.out.print("Perimetr: P= " + para.perimetr());

        }
    }
}

//abstract class vazifasi asosan umumiy shablon yaratib oliw
//quyidagicha abstract class yaratib olamiz va undan meros olib
//turli hil vazifalarni bajaruvchi classlar yaratiwimiz mumkin
//bunda @Override annotationdan foydalanamiz
abstract class Figure{
    abstract double yuza();
    abstract double perimetr();
}

class Rectangle extends Figure{

    double a,b;
    @Override
    double yuza() {
        return a*b;
    }

    @Override
    double perimetr() {
        return 2*(a+b);
    }
}

class Paralelogram extends Figure{

    double a,b,h;
    @Override
    double yuza() {
        return ((a+b)/2)*h;
    }

    @Override
    double perimetr() {
        return 2*(a+b);
    }
}
