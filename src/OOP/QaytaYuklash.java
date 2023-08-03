package OOP;
//Overload
//Bitta classda bir nechta turli parametrli lekin nomi bir xil metodlarni kelishi
public class QaytaYuklash {
    public static void main(String[] args) {
        A1 a1 = new A1();
        A1 a2 = new A1();
        a1.show(2,3,1);
        a2.show(1);
    }
}

class A1{
    public void show(int a){
        System.out.println("Birinchi metod ishga tushdi");
    }

    public void show(int a, int b){
        System.out.println("Ikkinchi metod ishga tushdi");
    }

    public void show(double a, double b, int c){
        System.out.println("Uchinchi metod ishga tushdi");
    }
}