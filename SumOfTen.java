   import java.util.Scanner;
public class SumOfTen{

public static void main(String [] args){
Scanner input = new Scanner(System.in);

  int number = 0;
    int sum = 0;

  while( number<=10){

  sum += number;
  number++;

  }

System.out.println("the sum of the first 10 is: "+ sum);

    }
}
