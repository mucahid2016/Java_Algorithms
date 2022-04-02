package Metinler;

public class B {
    public static void main(String[] args) {
        char harf = 'z';

        if (harf == 'a' || harf == 'o' || harf == 'u' || harf == 'ı') {
            System.out.println(harf + " Harfi Kalın Sesli'dir.");
        } else if (harf == 'e' || harf == 'ü' || harf == 'i' || harf == 'ö') {
            System.out.println(harf + " Harfi İnce Sesli Harf'tir.");
        } else {
            System.out.println(harf + " Harfi Sesli Bir Harf Değildir !!");
        }
    }
}
