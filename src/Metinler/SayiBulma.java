package Metinler;

public class SayiBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3, 4, 5};
        int aranacak = 5;
        boolean varMi = false;

        for (int i = 0; i < aranacak; i++) {
            if (aranacak == sayilar[i]) {
                varMi = true;
            } else {
                varMi = false;
            }
        }

        if (varMi) {
            System.out.println(aranacak + " sayısı dizi de mevcuttur.");
        } else {
            System.out.println(aranacak + " sayı dizide mevcut değildir.");
        }
    }
}
