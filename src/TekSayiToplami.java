import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {
        int n;
        double toplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Değerini Giriniz : ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                toplam += i;
            }
        }
        System.out.println("Kullanıcıdan Alınan Sayılara Kadar olan Tek Sayıların Toplamı : " + toplam);
    }
}
