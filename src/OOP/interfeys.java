package OOP;
//interface dan maqsad classdan voris olmay foydalanish
public class interfeys {
    public static void main(String[] args) {
        ansver ans = new ansver();
        ans.circle();
        ans.kvadrat();
        ans.rect();

    }
}
//interfaceda yaratilgan metodlar parametrsiz buladi
interface Yuza{
    void rect();
    void circle();
    void kvadrat();
}

class ansver implements Yuza{

    @Override
    public void rect() {
        int a=5 , b=4 ;
//        return a*b;             //return berish uchun  ***int rect();*** deb beriw zarur edi yani tipi void bulmaydi
        System.out.println("Rect S= " + (a * b));
    }

    @Override
    public void circle() {
        double r=3.4;
        System.out.println("Circle L= " + (2*Math.PI*Math.pow(r,2)));
    }

    @Override
    public void kvadrat() {
        int a=5;
        System.out.println("Kvadrat S= " + (a*a));
    }
}
