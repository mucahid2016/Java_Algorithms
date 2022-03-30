public class Fibonacci {
    public static void main(String[] args) {
        int s1 = 0, s2 = 1, toplam;

        do {
            toplam = s1 + s2;
            if (toplam > 1000) break;
            System.out.print(toplam + " - ");
            s1 = s2;
            s2 = toplam;
        } while (toplam < 1000);
    }
}
