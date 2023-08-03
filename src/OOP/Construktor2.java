package OOP;

public class Construktor2 {
    public static void main(String[] args) {
        Parametrsiz parametrsiz = new Parametrsiz();
        parametrsiz.age = 27;
        parametrsiz.name = "Xusniddin";
        parametrsiz.show();
    }
}

class Parametrsiz{
    public int age;
    public String name;

    void show(){
        System.out.println(name + " sizning yoshingiz " + age + " da !");
    }
}
