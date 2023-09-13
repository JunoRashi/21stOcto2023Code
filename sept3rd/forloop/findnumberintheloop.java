package sept3rd.forloop;

public class findnumberintheloop {

    public static void main(String[] args) {


        //go from 1 to 10
        //found 5 just break the loop

        for (int i = 0; i <= 10; i++) {

            System.out.println(i);
            if (i == 5) {
                System.out.println("found 5");
                break;
            }

        }

        System.out.println("ending the loop");

    }
}
