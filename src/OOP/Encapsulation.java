package OOP;

public class Encapsulation {
    public static void main(String[] args) {
        Rect rect = new Rect();

        rect.setA(4);
        rect.setB(6);
        rect.show();
    }
}

//Encapsulation bu qobiq ya'ni bitta classni ichida barcha ishni bajarish
//Encapsulationda Getter and Setter dan foydalaniladi
//Natijani olish uchun show metodidan foydalaniladi
class Rect{
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void show(){
        System.out.println("Yuza: S= " + a*b);
    }
}
