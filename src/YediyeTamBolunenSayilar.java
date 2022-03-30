import java.util.Scanner;

public class YediyeTamBolunenSayilar {
    public static void main(String[] args) {
        int n, m, toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("N Başlangıç Değerini Giriniz : ");
        n = input.nextInt();

        System.out.print("M Bitiş Değerini Giriniz : ");
        m = input.nextInt();
        System.out.println("7'ye Tam Bölünen Sayılar : ");
        for (int i = n; i <= m; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                toplam += i;
            }
        }

        System.out.println("N-M arasındaki 7'ye bölünen Sayıların Toplamı : " + toplam);
    }
}
