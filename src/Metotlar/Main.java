package Metotlar;

public class Main {
    public static void main(String[] args) {
        sayiBulma();
    }

    public static void sayiBulma() {
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
            mesajVer(aranacak + " sayısı dizi de mevcuttur.");
        } else {
            mesajVer(aranacak + " sayı dizide mevcut değildir.");
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
