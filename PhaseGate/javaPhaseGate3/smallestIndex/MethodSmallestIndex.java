public class MethodSmallestIndex{


    public static int Smallest(int[] arr){
       int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        return maxIndex;


    }





     public static void main(String [] args){
        int [] arr = {1,5,3,4,20,5};
        System.out.println(MethodSmallestIndex.Smallest(arr));




        }



}










