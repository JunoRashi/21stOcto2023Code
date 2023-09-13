package sept3rd.arrayprog;

import java.util.Scanner;

public class array05 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] userraay1 = new int[n];

        for (int i = 0; i < userraay1.length; i++) {
            System.out.println(userraay1[i]);
        }
    }
}
