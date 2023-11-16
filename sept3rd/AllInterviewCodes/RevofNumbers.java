package sept3rd.AllInterviewCodes;

public class RevofNumbers {

    public static void main(String[] args) {

        //int number=10;


//        byte b = 065;//------->//number starting with 0 is octal number -----only between 0---7
//
//
//        //octal to decimal number
//        //065---into decimal----0*8^2 + 6*8^1 + 5*8^0=53
//        // 53 will be the decimal number
//
//
//        System.out.println(b + 20);//53+20=73
//
//
//        // -----------------------------------------------------------------------------------------------------
//
//
//        int x = 5;
//        //  System.out.println(x++);
//
//        // System.out.println(++x);
//
//        System.out.println(x++ + ++x);


        int l = 2345;

        // int rem;
        int revnum = 0;

        while (l != 0) {
            int rem = l % 10;
            revnum = revnum * 10 + rem;
            l = l / 10;

        }
        System.out.println("The reverse of the given number is: " + revnum);

    }
}
