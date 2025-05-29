import java.util.Arrays;
public class studentScore{

    public static int[] sumOfRows(int[][] numbers) {
        int[] rowSums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                rowSum += numbers[i][j];
            }
            rowSums[i] = rowSum;
        }
        return rowSums;
    }




    //   public static double calculateAverage(int[][] numbers) {
    //     // int totalSum = 0;
    //     // int totalCount = 0;
    //     // for (int i = 0; i < numbers.length; i++) {
    //     //     for (int j = 0; j < numbers[i].length; j++) {
    //     //         totalSum += numbers[i][j];
    //     //         totalCount++;
    //     //     }
    //     // }
    //     // return (double) totalSum / totalCount;
    //    int[] rowSums = sumOfRows(numbers);
    // int totalSum = 0;
    // int totalElements = 0;
    // for (int sum : rowSums) {
    //     totalSum += sum;
    //     totalElements += numbers[0].length; // Assuming all rows have the same number of columns
    // }
    // return (double) totalSum / totalElements;
    // }

public static double[] calculateAverage(int[][] numbers) {
        double[] averages = new double[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                rowSum += numbers[i][j];
            }
            averages[i] = (double) rowSum / numbers[i].length;
        }
        }














}
