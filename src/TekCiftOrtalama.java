import java.util.Scanner;

public class TekCiftOrtalama {
    public static void main(String[] args) {
        int tekToplam = 0, ciftToplam = 0, tekSayac = 0, ciftSayac = 0;
        int n;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". Değeri Giriniz : ");
            n = input.nextInt();
            if (n % 2 == 0) {
                ciftSayac++;
                ciftToplam += n;
            } else {
                tekSayac++;
                tekToplam += n;
            }
        }
        double tekOrt = tekToplam / tekSayac;
        System.out.println("Tek Sayıların Toplamının Ortlaması : " + tekOrt);
        double ciftOrt = ciftToplam / ciftSayac;
        System.out.println("Çift Sayıların Toplamının Ortlaması : " + ciftOrt);
    }
}
