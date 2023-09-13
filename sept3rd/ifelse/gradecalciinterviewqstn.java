package sept3rd.ifelse;

import java.util.Scanner;

public class gradecalciinterviewqstn {

    public static void main(String[] args) {
        //Grade Calculator

        //WAP that calculates and displays letter grade for a given numerical score(e.g A,B,C,D & F)
        //based on following grading scale

       /* A-90 TO 100
        B-80 TO 89
        C-70 TO 79
        D-60 TO 69
        F-0 TO 59
*/


        //Take input from user
//grade>90 and <100-->sout A

//else if grade>70 and <79-->sout B

        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks");

        int m = sc.nextInt();

        char grade = 0;
//default value of char='/u0000'
        if (m >= 90 && m <= 100) {
            grade = 'A';
        } else if (m >= 80 && m < 89) {
            grade = 'B';
        } else if (m >= 70 && m < 79) {
            grade = 'C';
        } else if (m >= 60 && m < 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("your grade is  " + grade);
    }
}
