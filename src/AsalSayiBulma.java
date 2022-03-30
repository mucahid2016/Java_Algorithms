public class AsalSayiBulma {
    public static void main(String[] args) {
        int bolenSayac = 0;

        for (int i = 2; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    bolenSayac++;
                }
            }
            if (bolenSayac == 0) {
                System.out.print(i + " - ");
            }
            bolenSayac = 0;
        }
    }
}
