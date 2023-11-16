package sept3rd.AllInterviewCodes;

public class TwoDimensionArray001 {


    public static void main(String[] args) {


        int[][] matrix = new int[][]{

                {1, 2, 9},
                {2, 3, 8},
                {4, 5, 0}
        };


        //how to print all elements

        //we need to 2 loop


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }


    }


}











