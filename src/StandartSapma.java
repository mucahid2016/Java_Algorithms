import java.util.Random;
import java.util.Scanner;

public class StandartSapma {
    public static void main(String[] args) {
        int boyut, toplam = 0, elamanSayisi = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi Boyutunu Giriniz : ");
        boyut = input.nextInt();

        int[] dizi = new int[boyut];
        Random random = new Random();

        for (int i = 0; i < boyut; i++) {
            dizi[i] = random.nextInt(100);
            System.out.print(dizi[i] + " - ");
            elamanSayisi++;
            toplam += dizi[i];
        }
        System.out.println();
        double ort = (double) toplam / elamanSayisi;
        System.out.println("Ortalama : " + ort);

        double farkToplam = 0;

        for (int i = 0; i < boyut; i++) {
            farkToplam += Math.pow((dizi[i] - ort), 2);
        }

        double sapma = Math.sqrt(farkToplam / (boyut - 1));

        System.out.println("Standart Sapma : " + sapma);
    }
}
