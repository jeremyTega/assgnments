import java.util.Scanner;
public class AskQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, userAnswer, correctAnswer;
        int numberOfQuestions = 0;
        int askQuestion = 1;
        int finalScore = 0;

        while (numberOfQuestions < 10) {
            int userLife = 2;
            num1 = getRandom();
            num2 = getRandom();
            correctAnswer = num1 - num2;

            while (userLife > 0) {
                System.out.printf("Question %d: What is the answer to %d - %d? ", askQuestion, num1, num2);
                userAnswer = input.nextInt();

       if (userAnswer != correctAnswer) {
                    userLife--;

                } else {
                    finalScore++;

            break;
                }
            }

            if (userLife == 0) {

            }

            askQuestion++;
            numberOfQuestions++;
        }

        System.out.println("Your final score is: " + finalScore);

    }

    public static int getRandom() {
        return (int) (Math.random() * 100);
    }
}
