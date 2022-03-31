import java.util.Random;
import java.util.Scanner;

public class MatrisTranspozesi {
    public static void main(String[] args) {
        int satir, sutun;
        Scanner input = new Scanner(System.in);

        System.out.print("Satır Boyutunu Gir : ");
        satir = input.nextInt();

        System.out.print("Sütun Sayısını Gir : ");
        sutun = input.nextInt();

        int[][] m = new int[satir][sutun];

        Random random = new Random();

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                m[i][j] = random.nextInt(5);
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Transpoze Matris : ");
        int[][] t = new int[sutun][satir];

        for (int i=0;i<sutun;i++){
            for (int j=0;j<satir;j++){
                t[i][j]=m[j][i];
                System.out.print(t[i][j]+"  ");
            }
            System.out.println();
        }

    }
}

