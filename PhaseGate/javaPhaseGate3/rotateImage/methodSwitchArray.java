import java.util.Arrays;
public class methodSwitchArray{

 public static int[][] reverseArray(int[][] array) {
        int rows = array.length;
        int colum = array[0].length;
        int[][] reversed = new int[rows][colum];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colum; j++) {
                reversed[rows - 1 - i][colum - 1 - j] = array[i][j];
            }
        }

        return reversed;
    }


   public static void main(String[] args) {
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] reversed = reverseArray(original);

        System.out.println(Arrays.deepToString(reversed));
        //for (int[] row : reversed) {
            //for (int val : row) {
             //   System.out.print(val + " ");
           // }
         //   System.out.println();
       // }



}

}



