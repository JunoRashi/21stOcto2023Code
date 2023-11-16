package sept3rd.AllInterviewCodes;

import java.util.Scanner;

public class PalindromeString {


    public static void main(String[] args) {

        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String or_string = name;
        String rev = "";

        int len = or_string.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + or_string.charAt(i);


        }

        // System.out.println(rev);

        if (or_string.equals(rev)) {
            System.out.println(or_string + " is palindrome");
        } else {
            System.out.println(or_string + " is not palindrome");
        }


    }

}

