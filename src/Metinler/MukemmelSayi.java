package Metinler;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi = 1;
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (sayi == toplam) {
            System.out.println(sayi + " sayısı Mükemmel Bir Sayıdır.");
        } else {
            System.out.println(sayi + " sayısı Mükemmel bir Sayı Değildir. ");
        }
    }
}
