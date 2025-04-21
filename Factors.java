import java.util.Scanner;
public class Factors{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);


    System.out.print("enter a number");
    double usernumber = input.nextInt();

    for(double i = 0; i <= usernumber; i++){
        double result = usernumber / i;
         if(result % 1 == 0){
         int changedResult = (int) result;
         System.out.println(changedResult);
         }
    }


    }

}
