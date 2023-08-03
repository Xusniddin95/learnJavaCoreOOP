package OOP;
//Override
//turli classlarda bir xil nomli metodni keliwi (parametrsiz)
public class
QaytaYozish {
    public static void main(String[] args) {
//        A a = new A();
        B b = new B();

//        a.show();
        b.show();
    }
}

class A{
    public void show(){
        System.out.print("Hello ");
    }
}

class B extends A{
    public void show(){
        super.show();                       //A clasdan obyekt oliw wart emas
        System.out.println("World");
    }
}
