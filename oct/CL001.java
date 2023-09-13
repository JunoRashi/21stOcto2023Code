package oct;

public class CL001 {


    public static void main(String[] args) {


        Integer add[] = new Integer[5];
        System.out.println(add.length);

        add[0] = 9;
        add[1] = 5;
        add[2] = 7;
        add[3] = 8;
        add[4] = 5;

        //duplicates are not allowed
        System.out.println(add[0] = 9);
        System.out.println(add[1] = 5);
        System.out.println(add[2] = 7);
        System.out.println(add[3] = 8);
        System.out.println(add[4] = 5);


        //  add[5]=10;


    }
}
