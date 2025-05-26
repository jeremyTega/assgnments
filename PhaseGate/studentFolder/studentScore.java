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




      public static double calculateAverage(int[][] numbers) {
        int totalSum = 0;
        int totalCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                totalSum += numbers[i][j];
                totalCount++;
            }
        }
        return (double) totalSum / totalCount;
    }
















}
