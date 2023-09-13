package sept3rd.ifelse;

import java.util.Scanner;

public class Maxnum {
    public static void main(String[] args) {

        //a, b, c?

        //max --? terniary operator?----T


        //How to get input from User

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("your inputs are  " + a + " " + b + " " + c);

        if (a > b && b > c) {
            System.out.println("a has the max value in all three number");
        }
        if (b > c && b > a) {
            System.out.println("b has the max value in all three number");
        }
        if (c > b && c > a) {
            System.out.println("c has the max value in all three number");
        }
    }
}