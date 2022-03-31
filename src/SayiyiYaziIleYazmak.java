import java.util.Scanner;

public class SayiyiYaziIleYazmak {
    public static void main(String[] args) {
        int sayi, birler, onlar, yuzler, binler;
        char c;

        Scanner input = new Scanner(System.in);
        System.out.print("4 Basamaklı Bir Sayı Giriniz : ");
        sayi = input.nextInt();

        c = Integer.toString(sayi).charAt(0);
        binler = Integer.parseInt(Character.toString(c));


        c = Integer.toString(sayi).charAt(1);
        yuzler = Integer.parseInt(Character.toString(c));


        c = Integer.toString(sayi).charAt(2);
        onlar = Integer.parseInt(Character.toString(c));


        c = Integer.toString(sayi).charAt(3);
        birler = Integer.parseInt(Character.toString(c));


        String[] binlerBas = {"", "bin", "ikibin", "üçbin", "dörtbin", "beşbin", "altıbin", "yedibin", "sekizbin", "dokuzbin"};

        String[] yuzlerBas = {"", "yüz", "ikiyüz", "üçyüz", "dörtyüz", "beşyüz", "altıyüz", "yediyüz", "sekizyüz", "dokuzyüz"};

        String[] onlarBas = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};

        String[] birlerBas = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};

        System.out.println(binlerBas[binler] + " " + yuzlerBas[yuzler] + " " + onlarBas[onlar] + " " + birlerBas[birler]);
    }
}
