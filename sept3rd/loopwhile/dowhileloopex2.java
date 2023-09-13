package sept3rd.loopwhile;

public class dowhileloopex2 {

    public static void main(String[] args) {


//loop--stop execution when i is 2

        int i = 1;

        do {
            System.out.println("execute " + i + "th time");


            if (i > 2) {
                break;
            }
            i++;
        }
        while (i < 10);

    }


}



