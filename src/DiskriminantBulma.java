import java.util.Scanner;

public class DiskriminantBulma {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("A Sayısı : ");
        a = input.nextInt();

        System.out.print("B Sayısı : ");
        b = input.nextInt();

        System.out.print("C Sayısı : ");
        c = input.nextInt();


        double delta = (b * b) - 4 * (a * c);
        double deltaKok = Math.sqrt(delta);


        double diskriminant1 = (-b - (deltaKok)) / (2 * a);
        double diskriminant2 = (-b + (deltaKok)) / (2 * a);

        System.out.println("1. Diskriminant Değeri : " + diskriminant1);
        System.out.println("2. Diskriminant Değeri : " + diskriminant2);
    }
}
