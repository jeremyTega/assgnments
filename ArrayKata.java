public class ArrayKata{

public static int arrayOfIntegers (int[] numbers){
        int largest = 0;
        for (int i =0; i<numbers.length; i++){
            if(numbers[i] > largest){
            largest = numbers[i];
            }

        }
        return largest;

}

public static int minimunInt(int [] numbers){

        int smallest = numbers[0];
        for (int i =0; i < numbers.length; i++){

          if(numbers[i] < smallest){
          smallest = numbers[i];
          }
        }
        return smallest;

}

public static int sumOf (int [] numbers){
 int sum = 0;

 for(int number : numbers){
  sum += number;

 }
 return sum;


}

        public static int sumOfEven(int [] numbers){
        int sum = 0;

        for(int number : numbers){
        if (number % 2 == 0){
        sum += number;
        }

        }
        return sum;


        }

         public static int sumOfOdd(int [] numbers){
        int sum = 0;

        for(int number : numbers){
        if (number % 2 != 0){
        sum += number;
        }

        }
        return sum;


        }

        public static int[] maximumAndMinimum(int [] numbers){
        int largest = numbers[0];
        int smallest = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
            largest = numbers[i];

            }
            if(numbers[i] < largest){
            smallest = numbers[i];
            }
        }

        return new int[] {largest, smallest};
        //return smallest;


        }


        public static int noOfOddNumers(int [] numbers){
       int  count = 0;
        for(int number: numbers){
        if(number % 2 != 0){
        count ++;
        }
        }
        return count;
        }


          public static int noOfEvenNumers(int [] numbers){
       int  count = 0;
        for(int number: numbers){
        if(number % 2 == 0){
        count ++;
        }
        }
        return count;
        }

           public static int[] noOfEvenNumers(int [] numbers){

        for(int number: numbers){
        if(number % 2 != 0){
        count ++;
        }
        }
        return count;
        }


         public static int[] oddNumbersIn(int [] numbers){
            int[] oddNumbers = new int[]
            int count = 0;
        for(int number: numbers){
        if(number % 2 != 0){
        oddNumbers[count] = number;
        count ++;
        }
        }
        return oddNumbers;
        }





}
