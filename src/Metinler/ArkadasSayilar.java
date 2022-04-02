package Metinler;

public class ArkadasSayilar {
    public static void main(String[] args) {
        int s1 = 220, s2 = 284, total1 = 0, total2 = 0;

        for (int i = 1; i < s1; i++) {
            if (s1 % i == 0) {
                total1 += i;
            }
        }

        for (int i = 1; i < s2; i++) {
            if (s2 % i == 0) {
                total2 += i;
            }
        }

        if ((s1 == total2) && (s2 == total1)) {
            System.out.println(s1+" ve "+s2+" arkadaş Sayılardır !");
        }else {
            System.out.println(s1+" ve "+s2+" arkadaş Sayı Değildir ! ! !");
        }
    }
}
