package sept3rd.switchdemo;

import java.util.Scanner;

public class switchdemo {

    public static void main(String[] args) {


//switch(expression)--->what all data types are allowed in switch statement and
        //two same case are not allowed
        /*case A:
        System.out.println("print A");

*/
//Take user input
        //day 1----monday


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day");

        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("monday");
            case 2:
                System.out.println("tuesday");
            case 3:
                System.out.println("wednesday");

            case 4:
                System.out.println("thursday");
            case 5:
                System.out.println("friday");

            case 6:
                System.out.println("saturday");

            case 7:
                System.out.println("sunday");

        }


    }
}
