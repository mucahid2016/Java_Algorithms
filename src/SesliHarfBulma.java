import java.util.Scanner;

public class SesliHarfBulma {
    public static void main(String[] args) {
        String isim;
        int sesliSayac = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Adınızı Giriniz : ");
        isim = input.nextLine();

        for (int i = 0; i < isim.length(); i++) {
            char c = isim.charAt(i);
            if (c == 'a' || c == 'e' || c == 'ı' || c == 'ü' || c == 'o' || c == 'u' || c == 'i' || c == 'ö') {
                sesliSayac += i;
            }
        }
        System.out.println("İsimde  " + sesliSayac + "  tane sesli sayı bulunmaktadır.");
        System.out.println("Sessiz Sayısı : " + (isim.length() - sesliSayac));
    }
}
