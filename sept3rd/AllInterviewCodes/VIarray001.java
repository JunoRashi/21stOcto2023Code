package sept3rd.AllInterviewCodes;

import java.util.Scanner;

public class VIarray001 {


//Take input n--->5
    //marks--->91, 92, 93, 97, 89

    //find the maximum and minimum


    public static void main(String[] args) {

        System.out.println("enter the subject marks");
        Scanner sc = new Scanner(System.in);

        int total_number_subject = sc.nextInt();

        int[] all_marks = new int[total_number_subject];

        for (int j = 0; j < all_marks.length; j++) {
            System.out.println("enter marks one by one");
            all_marks[j] = sc.nextInt();
        }

        System.out.println("here is your marks");


        for (int q = 0; q < all_marks.length; q++) {
            System.out.println("Here is marks of your subject-------->" + all_marks[q]);
        }


        int max = all_marks[0];
        for (int k = 0; k < all_marks.length; k++) {

            if (all_marks[k] > max) {
                max = all_marks[k];
            }

        }


        System.out.println("the maximum is ----->  " + max);

    }
}
