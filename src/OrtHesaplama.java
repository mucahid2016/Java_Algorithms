import java.util.Scanner;

public class OrtHesaplama {
    public static void main(String[] args) {
        int vize, finals;
        Scanner input = new Scanner(System.in);

        System.out.print("Vize notunuzu Giriniz : ");
        vize = input.nextInt();

        System.out.print("Final Notunuzu Giriniz : ");
        finals = input.nextInt();

        double ort = (vize * 0.40) + (finals * 0.60);
        System.out.println("Ortalamanız : " + ort);

        if (ort >= 50 && ort <= 100) {
            System.out.println("Sınıfı Geçtiniz !");
        } else {
            System.out.println("Sınıfta Kaldınız Geçmiş Olsun !");
        }
    }
}
