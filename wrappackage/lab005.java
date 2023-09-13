package wrappackage;

public class lab005 {


    public static void main(String[] args) {
//String questions

        String s1 = "EY";
        String s2 = "EY";

        System.out.println(s1 == s2);


        String s3 = new String("EY");
        String s4 = new String("EY");

        System.out.println(s3 == s4);


        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));


        int p = 10;
        int q = 90;
        String f = "EY";
        System.out.println(f + p + q);

    }
}
