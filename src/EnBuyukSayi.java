import java.util.Scanner;

public class EnBuyukSayi {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayı : ");
        a = input.nextInt();

        System.out.print("2. Sayı : ");
        b = input.nextInt();

        System.out.print("3. Sayı : ");
        c = input.nextInt();

        if (a < c && b < c) {
            System.out.println("En Büyük C 'dir.");
        }else if (a<b&&c<b){
            System.out.println("En büyük B'dir.");
        }else {
            System.out.println("En Büyük A 'dir.");
        }
    }
}
