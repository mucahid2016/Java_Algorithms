package Metotlar;

public class A {
    public static void main(String[] args) {
        ekle();
        sehirVer();
        int toplam = topla(1, 2, 3, 4, 5);
        System.out.println(toplam);
    }


    public static void ekle() {
        System.out.println("Eklendi !");
    }

    public static void sil() {
        System.out.println("Silindi !");
    }

    public static void guncelle() {
        System.out.println("Güncellendi !");
    }

    public static String sehirVer() {
        return "Ankara";
    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}
