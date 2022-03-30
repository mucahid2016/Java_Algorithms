import java.util.Scanner;

public class DiziOrt {
    public static void main(String[] args) {
        int boyut, toplam = 0, sayac = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Dizi Boyutunu Giriniz : ");
        boyut = input.nextInt();

        int[] dizi = new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.print(i+1 + ". Eleman : ");
            dizi[i] = input.nextInt();
            sayac++;
            toplam += dizi[i];
        }

        double ort = (double) toplam / sayac;
        System.out.println("Toplam : " + toplam);
        System.out.println("Ortalama : " + ort);
    }
}
