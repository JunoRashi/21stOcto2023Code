package sept3rd.forloop;

public class forwithinfor {


    public static void main(String[] args) {

//0--0,1,2,//1---0,1,2//2---0,1,2//3---0,1,2


        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            {
                for (int j = 0; j < 3; j++) {
                    System.out.println(j);
                }
            }


            // i=0, j=0, 1, 2,
            // i=1, j=0, 1, 2,
            // i=2, j=0, 1, 2,
            // i=3, j=0, 1, 2,


            //*
            //**
            //***
            //****
            //*****


        }

    }


    public static class Reverserightangletriangle {


        public static void main(String[] args) {

            for (int i = 1; i <= 4; i++) {

                {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }


            }


        }


    }
}
