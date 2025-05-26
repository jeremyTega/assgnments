public class ArrayMethods{



public static int[] squareArray(int[] numbers) {
    int[] squared = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
        squared[i] = numbers[i] * numbers[i];
    }
    return squared;
}



public static int[] ascending(int[] numbers) {

    for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i];
        }

    int temp;
    for (int i = 0; i < numbers.length ; i++) {
        for (int j = 0; j < numbers.length  -1; j++) {
            if (numbers[j] > numbers[j + 1]) {
                  temp = numbers[j];
                numbers[j]  = numbers[j + 1];
                numbers[j + 1] = temp;
            }
        }
    }
    return numbers;
}





}
