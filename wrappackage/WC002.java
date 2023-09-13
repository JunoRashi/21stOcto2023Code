package wrappackage;

public class WC002 {


    public static void main(String[] args) {

        int x = 123;

        //String s1=x; --->not possible

        // String s1=(String)x;--->primitive data type cannot be converted into the class

        String s2 = x + "";//correct but not recommended

        String s3 = String.valueOf(x);// converted from primitive data type to string

        System.out.println(s3);


        //

        double d1 = 9087.90;

        String s5 = String.valueOf(d1);

        String s6 = Double.toString(d1);//using wrapper class

        // STRING TO PRIMITIVE


    }
}
