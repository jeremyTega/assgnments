import java.util.Arrays;

public class factorsOfAnArray{
     public static int[] factors(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                newArr[index++] = i;
            }
        }
        return newArr;
    }

    public static void main(String[] args){

    System.out.print(factorsOfAnArray.factors(7));

}






}


