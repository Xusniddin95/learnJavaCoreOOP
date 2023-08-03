package OOP.inheritense_polymorfizm;

public class merosxorlik {
    public static void main(String[] args) {

//        Inheritance
//        birinchiAvlod birinchi = new birinchiAvlod();
//        ikkinchiAvlod ikkinchi = new ikkinchiAvlod();
//        uchinchiAvlod uchinchi = new uchinchiAvlod();
//        turtinchiAvlod turtinchi = new turtinchiAvlod();
//
//
//        System.out.println("Birinchi avlod:");
//        birinchi.avlod1();
//
//        System.out.println();
//        System.out.println("Ikkinchi avlod:");
//        ikkinchi.avlod1();
//        ikkinchi.avlod2();
//
//        System.out.println();
//        System.out.println("Uchinchi avlod:");
//        uchinchi.avlod1();
//        uchinchi.avlod2();
//        uchinchi.avlod3();
//
//        System.out.println();
//        System.out.println("To'rtinchi avlod:");
//        turtinchi.avlod1();
//        turtinchi.avlod2();
//        turtinchi.avlod3();
//        turtinchi.avlod4();


//        Polymorfism

        birinchiAvlod car[] = new birinchiAvlod[4];
        car[0] = new birinchiAvlod();
        car[1] = new ikkinchiAvlod();
        car[2] = new uchinchiAvlod();
        car[3] = new turtinchiAvlod();


        for (int i = 0; i < 4; i++) {
            car[i].avlod();
        }
    }
}
