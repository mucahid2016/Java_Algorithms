package Metinler;

public class AlgoritmikYapi {
    public static void main(String[] args) {
        int number = 23;

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Sayı asaldır !");
        }else {
            System.out.println("Sayı Asal Değildir !");
        }
        System.out.println(isPrime);
    }
}
