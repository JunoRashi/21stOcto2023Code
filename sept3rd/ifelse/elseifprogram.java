package sept3rd.ifelse;

public class elseifprogram {
    public static void main(String[] args) {


        int a = 7;
        int b = 34;
        int c = 98;
        int max = 0;


        if (a > b && a > c) {

            max = a;
        } else if (b > a && b > c) {

            max = b;
        } else {
            max = c;
        }
    }
}