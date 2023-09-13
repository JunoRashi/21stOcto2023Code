package sept3rd.switchdemo;

import java.util.Locale;
import java.util.Scanner;

public class vowelprogram {


    public static void main(String[] args) {
        System.out.println("enter the char");
        Scanner sc = new Scanner(System.in);
        String c = sc.next();

        c = c.toLowerCase(Locale.ROOT);

        switch (c) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("it is a vowel");
                break;

            default:
                System.out.println("it is not vowel");
        }
    }
}