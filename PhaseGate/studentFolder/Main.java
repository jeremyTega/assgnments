public class Main{
public static void main(String [] arg){
        int[][] numbers = {
            {3, 3, 4},
            {9, 1, 3},

        };


        // int[] rowSums = studentScore.sumOfRows(numbers);
        // System.out.println("Sum of each row:");
            double average = studentScore.calculateAverage(numbers);
            System.out.println(average);
        // for (int sum : average) {
        //     System.out.println(average);
        // }
         for (int i = 0; i < numbers.length; i++) {
            System.out.println("Average of row " + (i + 1) + ": " + numbers[i]);
        }


}


}

