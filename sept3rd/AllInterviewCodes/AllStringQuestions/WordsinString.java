package sept3rd.AllInterviewCodes.AllStringQuestions;

import java.util.Scanner;

public class WordsinString {

    public static void main(String[] args) {

        System.out.println("Enter the String");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();


        int count = 1;

        int l = name.length();

        for (int i = 0; i < l - 1; i++) {

            if ((name.charAt(i) == ' ') && (name.charAt(i + 1) != ' ')) ;
            {
                count++;
            }

        }

        System.out.println("the number of words in sentence " + count);
    }


}





