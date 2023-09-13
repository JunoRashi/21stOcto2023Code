package sept3rd.arrayprog;

public class array03 {


    public static void main(String[] args) {


        String[] fruit = new String[2];

        fruit[0] = "orange";
        fruit[1] = "apple";
        System.out.println(fruit.length);

        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }

    }
}
