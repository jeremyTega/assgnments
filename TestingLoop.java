import java.util.Scanner;
public class TestingLoop{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
      // int computerGuess = (int) (Math.random() * 11);


    int userTry = 1;

    while(userTry <=3){
    int computerGuess = (int) (Math.random() * 11);

        System.out.println("enter a number between 1 and 10");
        int userGuess = input.nextInt();
         if(userGuess <1 || userGuess > 10) {
         System.out.println("number out of scope,");
         continue;
         }

            if(userGuess == computerGuess) {
             System.out.printf("computer is %d you are %d you won", computerGuess, userGuess);
            break;
            }
        if(userGuess != computerGuess) {
             System.out.printf(" wrong!!, computer is %d you are %d ", computerGuess, userGuess);

            }

           userTry++;
       }




      // for(int userTry = 1; userTry <=3; userTry++){
      // int computerGuess = (int) (Math.random() * 11);
      // System.out.println("enter a number between 1 and 10");
      //   int userGuess = input.nextInt();
      //
      //       if(userGuess == computerGuess) {
      //        System.out.printf("computer is %d you are %d you won", computerGuess, userGuess);
      //       break;
      //       }
      //   if(userGuess != computerGuess){
      //        System.out.printf(" wrong!!, computer is %d you are %d ", computerGuess, userGuess);
      //
      //       }
      //       if(userGuess <1 || userGuess > 10) {
      //       System.out.println("number out of scope,");
      //       userTry--;
      //       }
      //
      // }







    // int count = 0;
    //
    // while(count != 5){
    //   System.out.println("i love you");
    //   count++;
    //
    // }

    // for(int count =0; count <5 ; count++){
    //   System.out.println("this is number: " + (count+1));
    // }




    }


}
