import  java.util.Arrays;
public class SortArrayAscending {
    public static void main(String[] args) {
        int[] arr = {9,2,7,0,-1000};


      int arr [][] = {{1,2,3},{4,5,6}};






        // int[] rowSums = studentScore.sumOfRow(numbers);
        // System.out.println("Sum of each row:");
        // for (int sum : rowSums) {
        //     System.out.println(sum);
        // }





        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //
        //             temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }


        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(ArrayMethods.ascending(arr) ));


    }
}










