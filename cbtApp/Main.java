import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter number of copies");
    int numberOfCopies = input.nextInt();
    int totalPrice =PriceCalculator.calculateTotalPrice(numberOfCopies);
    System.out.println(totalPrice);


    }


}
