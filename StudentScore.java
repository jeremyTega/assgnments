import java.util.Scanner;
public class StudentScore{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);


    int count = 0;
    int totalStudentScoreCollected = 0;
    int gradeA = 0;
    int gradeB = 0;
    int gradeC = 0;
    int gradeD = 0;
    int gradeF = 0;
     int InvalidInput = 0;


    while(count != 10){

        System.out.println("Enter Score for 10 student ");
        int ValidScore = input.nextInt();


            if(ValidScore < 0 ||  ValidScore > 100 || ValidScore == -0 ){
            System.out.println("number not a valid score");
            InvalidInput++;
            continue;
            }

        int score = ValidScore / 10;



        switch(score){
        case 10:
        case 9:
        case 8:{
        System.out.println(" user Grade is : A");
        gradeA++;
        break;
        }
         case 7:{
         System.out.println("user Grade is : B");
         gradeB++;
        break;
        }
         case 6:{
         System.out.println("user Grade is : C");
         gradeC++;
        break;
        }
        case 5:{
         System.out.println("user Grade is : D");
         gradeD++;
        break;
        }

        default:{ System.out.println("user Grade is : F");
        gradeF++;
        }
        }


    count++;



    }

     System.out.println(" the number of invalid entry is " + InvalidInput);
     System.out.println(" the number of student with Grade A " + gradeA);
     System.out.println(" the number of student with Grade B " + gradeB);
     System.out.println(" the number of student with Grade C " + gradeC);
     System.out.println(" the number of student with Grade D " + gradeD);
     System.out.println(" the number of student with Grade F " + gradeF);




}
}
