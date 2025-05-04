
public class Kata{
public static boolean isEven(int number){
if(number % 2 == 0){
return true;
}
return false;
}


public static boolean isPrime(int number){
if (number <1 ) return false;
for (int i = 2; i < number /2; i++){
if(number % i == 0) return false;
}
return true;
}

 public static int subtract(int number1, int number2) {
        if (number1 > number2) {
            return number1 - number2;
        } else {
            return number2 - number1;
        }

    }

public static float divide(int number1, int number2) {
        if (number2 == 0) {
            return 0;
        } else {
            return (float)number1 / number2;
        }
    }
public static int factorsOf(int number) {
        int count = 0;

        if (number <= 0) {
            return 0;   }
	for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count;
    }
public static boolean isSquare(int number) {
        if (number < 0) {
            return false;
	  }
	for (int i = 0; i <= number / 2; i++) {
            if (i * i == number) {
                return true;
            }
        }

        return false;
    }
public static boolean isPalindrome(int number) {
        if (number < 10000 || number > 99999) {
            return false;
        }
        int myNumber = number;
        int reversed = 0;
        while (myNumber > 0){
        int other = myNumber % 10;
         reversed = reversed * 10  + other;
         myNumber = myNumber / 10;
        }
        if(reversed == number ){
        return true;
        }
        return false;
	}
public static long factorialOf(int number) {
        if (number < 0) {
            return 0;
        }

        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
public static long squareOf(int number) {
  if(number == 0) {
	return 0;
	}
	long result = 1;
if(number < 0 || number > 0) {
	result *= number * number;
	}
	return result;
}


}
