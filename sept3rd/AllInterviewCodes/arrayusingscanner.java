package sept3rd.AllInterviewCodes;

import java.util.Scanner;

public class arrayusingscanner {

    public static void main(String[] args) {

        System.out.println("how many elements as per the length you want in array");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] num1 = new int[n];

        for (int j = 0; j < num1.length; j++) {
            System.out.println(num1[j]);
        }

    }
}
