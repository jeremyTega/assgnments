import java.util.Scanner;
public class MyStrings {

    public static void main(String [] args){
    Scannet input = new Scanner(System.in);

    // String words = "hello world";
    //     int count = words.length();
    //     char letter = words.charAt(4);
    // System.out.println(words);
    // System.out.println(count);
    // System.out.println(letter);
    //  System.out.println(words.toLowerCase());
    //  System.out.println(words.toUpperCase());
    // String[] splitWords = words.split(" ");
    // for (String word : splitWords) {
    // System.out.println(word);
//}

System.out,printls("enter a word");
String userwords = input.nextLine();
    String [] splitWord = userwords.split(" ")

    for(String word : splitWord){
    System.out.print(word);
    }


    }


}
