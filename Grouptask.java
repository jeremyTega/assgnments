import java.util.Scanner;

public class Grouptask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String words = input.nextLine();

        int vowelCount = 0;

        for (int i = 0; i < words.length(); i++) {
            char ch = Character.toLowerCase(words.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
