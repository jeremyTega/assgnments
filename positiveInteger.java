   import java.util.Scanner;
public class positiveInteger{

public static void main(String [] args){
Scanner input = new Scanner(System.in);
    System.out.print("enter a positive integer");
    int numberEntered = input.nextInt();

    int multiplyNo = 1;

    while(multiplyNo <= 12){
    if (numberEntered < 1){
    System.out.println("kindly enter a positive number");
    numberEntered = input.nextInt();
    continue;
    }
    int result = numberEntered * multiplyNo;
    System.out.println(numberEntered  + " x " +  multiplyNo + " = " + result);
    multiplyNo ++;
    }



}


}
