package sept3rd.AllInterviewCodes.AllStringQuestions;

import java.util.Scanner;

public class splitmethod {

    public static void main(String[] args) {
        System.out.println("Enter the String");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        int count = 0;
        String spc[] = name.split(" ");


        System.out.println(spc.length);

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') {
                count++;
            }


        }
        System.out.println(count);

    }
}


//        for (int i = 0; i < spc.length; i++) {
//            System.out.println(spc[i]);
//
//            count++;
//        }
//        System.out.println("the total number of words  "+count);