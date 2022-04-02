package Metinler;

import java.util.Locale;

public class A {
    public static void main(String[] args) {
        String message = "Bugün Hava Çok Güzel.";
    /*
dasdasdas
* */
        System.out.println("Karakter Sayısı : " + message.length());
        System.out.println("5. Eleman : " + message.charAt(4));
        System.out.println(message.concat(" Yaşasın !"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("!"));
        char[] karakterler = new char[5];
        message.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("a"));

        System.out.println(message.replace("a","b"));
        System.out.println(message.substring(0,5));

        for (String kelime : message.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
