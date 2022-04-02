package Metotlar;

public class A {
    public static void main(String[] args) {
        ekle();
        sehirVer();
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
    public static String sehirVer(){
        return "Ankara";
    }
}
