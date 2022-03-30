import java.util.Scanner;

public class TerstenStringYazma {
    public static void main(String[] args) {
        String isim;
        String terstenIsim = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Adınızı Giriniz : ");
        isim = input.nextLine();

        for (int i=isim.length()-1;i>=0;i--) {
            System.out.print(isim.charAt(i)+ " - ");
        }
    }
}
