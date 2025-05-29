public class MethodStringNum{

    public static boolean stringDigits(String numbers){
        numbers.valueOf(numbers);
        int num = numbers;
        int temp;
        int [] myNumber = new int[numbers];
        for(int i = 0; i < numbers.length(); i++){
            temp = num % 10;
            myNumber[i] = temp;
            num / 10;

        }


    }




}
