import java.util.Scanner;

public class CumledekiKelimeSayisi {
    public static void main(String[] args) {
        String gir;
        Scanner input = new Scanner(System.in);
        System.out.print("Cümleni Gir : ");
        gir = input.nextLine();

        System.out.println("Harf Sayısı : " + gir.length());

        int sayac = 0;

        for (int i = 0; i < gir.length(); i++) {
            if (gir.charAt(i) == ' ') {
                sayac++;
            }
        }
        System.out.println("Kelime Sayısı : " + (sayac + 1));
    }
}
