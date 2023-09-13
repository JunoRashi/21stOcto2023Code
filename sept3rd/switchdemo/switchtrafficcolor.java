package sept3rd.switchdemo;

import java.util.Scanner;

public class switchtrafficcolor {

    public static void main(String[] args) {

//Simulate a traffic light with three possible states: "Red", "Yellow" and "Green"
//WAP to that takes an integer representing the current
//State of traffic light and prints the next state
//Use a switch statement to cycle through the states

        // 1----> Red----> Yellow
        //2----->Yellow--->Green
        //3----->Green---->Red

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1-3 which state you are in");
        int state = sc.nextInt();


        //Red--->Yellow---->Green


        switch (state) {
            case 1:
                System.out.println("Next will be Yellow");
                break;

            case 2:
                System.out.println("Next will be Green");
                break;
            case 3:
                System.out.println("Next will be Red");
                break;
            default:
                System.out.println("Invalid state ");
                break;
        }


    }


}
