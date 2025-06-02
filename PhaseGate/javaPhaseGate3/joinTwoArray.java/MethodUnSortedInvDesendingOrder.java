import java.util.Arrays;
import java.util.Collections;
public class MethodUnSortedInvDesendingOrder{
    public static Integer[] mergeAndSort(int[] Myarr1, int[] Myarr2) {

        int totalLength = Myarr1.length + Myarr2.length;
        Integer[] merged = new Integer[totalLength];

        for (int i = 0; i < Myarr1.length; i++) {
            merged[i] = Myarr1[i];
        }
       for (int i = 0; i < Myarr2.length; i++) {
            merged[Myarr1.length + i] = Myarr2[i];
        }
        Arrays.sort(merged, Collections.reverseOrder());

        return merged;
    }

     public static void main(String[] args) {
        int[] array1 = {5, 2, 9};
        int[] array2 = {1, 6, 3};

        Integer[] result = mergeAndSort(array1, array2);

        System.out.println( Arrays.toString(result));
    }



}






