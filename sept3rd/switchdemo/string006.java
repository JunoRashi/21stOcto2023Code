package sept3rd.switchdemo;

public class string006 {


    public static void main(String[] args) {


        String s = "rashi";

        String s2 = "singh";

        for (int i = 0; i < 1000; i++) {
            s2 = s2 + s;
            System.out.println(s2);
        }

    }
}
