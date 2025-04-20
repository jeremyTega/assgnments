   import java.util.Scanner;
public class ManyNumber{

public static void main(String [] args){
Scanner input = new Scanner(System.in);
    System.out.println("enter a number use space to differentiate number enter -1 to end");
 int number;
 int count = 0;
 int largest = 0;
 int smallest = 1000000000;

    while (true){
    number = input.nextInt();
    if(number > largest){
    largest = number;}
    if(number < smallest){
    smallest = number;}
    count ++;

    if(number == -1){
    break;
    }
     // System.out.println( "largest is " + largest);
     // System.out.println( "smallest is " + smallest);
    }
    System.out.println( "largest is " + largest);
     System.out.println( "smallest is " + smallest);

    }
}
