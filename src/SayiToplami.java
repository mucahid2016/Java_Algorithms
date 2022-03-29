import java.util.Scanner;

public class SayiToplami {
    public static void main(String[] args) {
        int s1, s2;
        double ort;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Sayi : ");
        s1 = scanner.nextInt();

        System.out.print("2. Sayi : ");
        s2 = scanner.nextInt();

        ort = (double) (s1 + s2) / 2.0;
        System.out.println(ort);
    }
}
