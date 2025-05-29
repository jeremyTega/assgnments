public class MethodUniqueNumbersInAnArray{

        public static int unique( int[] arr){
                int count =0;
                int sum = 0;
               for(int i : arr){
                int temp = i;
                   for (int j : arr){
                      if (i == j){
                        count ++;
                      }
                   }
                   if(count > 1){
                      count = 0;

                   }else{
                    sum += i;
                   }

               }
               return sum;

        }




}
