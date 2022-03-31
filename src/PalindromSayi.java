public class PalindromSayi {
    public static void main(String[] args) {
        String duz, ters;
        for (int i = 1000; i < 10000000; i++) {
            duz = Integer.toString(i);
            ters = "";

            for (int j = duz.length() - 1; j >= 0; j--) {
                ters += (char) duz.charAt(j);
            }

            if (duz.equals(ters)) {
                System.out.print(i + " - ");
            }
        }
    }
}
