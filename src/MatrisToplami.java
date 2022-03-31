import java.util.Random;

public class MatrisToplami {
    public static void main(String[] args) {
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] toplam = new int[3][3];

        Random random = new Random();

        System.out.println("1. Matris : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = random.nextInt(5);
                System.out.print(m1[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("2.Matris : ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = random.nextInt(5);
                System.out.print(m2[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Toplam Matris :");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                toplam[i][j]=m1[i][j]+m2[i][j];
                System.out.print(toplam[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
