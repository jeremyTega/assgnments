import java.util.Arrays;
public class Main{
    public static void main(String [] args){

                int[] arr = {1,1,2,2,3,3,4,4,5,5,6,6};
                int[] newArr;
                //System.out.println(uniqueNumbers.unique(arr));

                int count = 0;
               for(int i : arr){
                int temp = i;
                   for (int j : arr){

                   if(i==j){
                    newArr[i+1] = j;
                   }

                   }


               }

               System.out.println(Arrays.toString(newArr));


        }

     }






