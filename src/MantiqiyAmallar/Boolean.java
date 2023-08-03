package MantiqiyAmallar;

import java.util.Locale;

public class Boolean {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        boolean A=true, B=false, C=true, D=false;
        boolean bool = !((A&&B)||(C&&D))&&(A&&B);
        System.out.println(bool);
    }
}
