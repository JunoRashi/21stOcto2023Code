package sept3rd.switchdemo;

import java.util.Scanner;

public class browserswitch {


    public static void main(String[] args) {
        System.out.println("enter the browser name");

        Scanner sc = new Scanner(System.in);

        String browser = sc.next();

        switch (browser) {

            case "chrome":
                System.out.println("need to start in chrome browser");
                break;

            case "firefox":
                System.out.println("need to start in firefox browser");
                break;

            case "edge":
                System.out.println("need to start in edge browser");
                break;
            default:
                System.out.println("no browser will start");


        }


    }


}
