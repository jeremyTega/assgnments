 import java.util.Scanner;
public class raiseToPower{

public static void main(String [] args){
Scanner input = new Scanner(System.in);

  System.out.println("enter first numbers");
  int number1 = input.nextInt();
  System.out.println("enter second number");
  int number2 = input.nextInt();
  int result =1;

  for(int i=1; i<=number2; i++){
       result *= number1;
  }

  System.out.println(result);

    }
}
