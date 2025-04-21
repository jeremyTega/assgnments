   import java.util.Scanner;
public class Factoria{

public static void main(String [] args){
Scanner input = new Scanner(System.in);
    System.out.println("enter a number");
    int UserNumber = input.nextInt();

    if(UserNumber < 1){

    System.out.println("there is no factoria for 0 or negative number");
    }else{
     int factoria = 1;
     int i = 1;

    while(i <= UserNumber ){

    factoria *= i;
    i++;

     }
     System.out.println("the factorial of " + UserNumber + " Is " + factoria);
    }


}


}
