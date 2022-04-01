package Diziler.ReCapProject;

public class Main {
    public static void main(String[] args) {
        double[] myList = {1.1, 1.2, 1.3, 1.4};
        double toplam = 0;
        double max = myList[0];
        for (double number2 : myList) {
            if (max < number2) {
                max = number2;
            }
        }
        System.out.println("En Büyük : " + max);

        for (double number : myList) {
            System.out.print(number + " ");
            toplam += number;
        }
        System.out.println();
        System.out.println(toplam);
    }
}
