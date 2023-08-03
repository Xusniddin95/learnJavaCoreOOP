package masalalar;

import java.util.Scanner;

public class uzun_soz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String soz1="", soz2="";
        System.out.print("Matn kiriting:  ");
        String matn = scanner.nextLine();
        matn += ' ';
        for (int i = 0; i <matn.length(); i++) {
            char belgi = matn.charAt(i);
            if (belgi != ' '){
                soz1 += belgi;
            }else {
                if (soz1.length() > soz2.length()){
                    soz2 = soz1;
                }
                soz1 = "";
            }
        }

        System.out.print("Matndagi eng uzun so'z: ");
        System.out.println(soz2);
    }
}
