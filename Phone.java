import java.util.Scanner;
public class Phone{
  static Scanner input = new Scanner(System.in);
    public static void main(String [] args){


    System.out.println("""
    hello,
    welcome to Tega`s phone,
    kindly enter:
    1  -> Phone Book
    2  -> Messages
    3  -> Chat
    4  -> Call Register
    5  -> Tones
    6  -> Setting
    7  -> Call divert
    8  -> Games
    9  -> Calcultor
    10 -> Reminder
    11 -> Clock
    12 -> Profiles
    13 -> Sim services

    """);
     int userInput = input.nextInt();


        switch(userInput){
          case 1 -> PhoneBook();
          case 2 -> messages();
          default -> System.out.println("invalid input");
        }    //userInput closing


  }  //void main end

//............................................................................
public static void PhoneBook(){
           System.out.println("""
    1  - Search
    2  - Service Nos
    3  - Add Name
    4  - Erase
    5  - Edit
    6  - Assgn Tone
    7  - Send b`card
    8  - Options
    9  - Speed dial
    10 - voice tags

    """);
           int phoneBookInput = input.nextInt();

        switch(phoneBookInput){
        case 1 : System.out.println("Search"); break;
        case 2 : System.out.println("Service Nos"); break;
        case 3 : System.out.println("Add Name"); break;
        case 4 : System.out.println("Earse"); break;
        case 5 : System.out.println("Edith"); break;
        case 6 : System.out.println("Assgn Tone"); break;
        case 7 : System.out.println("Send b`card"); break;
        case 8 :{
                System.out.println(  """
    1  -> Type of view
    2  -> Memory status

    """);

        int card = input.nextInt();
        if(card == 1) System.out.println("Type of view");
        if(card == 2)System.out.println("Memory status");
                }

        case 9 : System.out.println("Speed dial"); break;
        case 10 : System.out.println("voice tags"); break;
        }


                }

//............................................................................

                public static void messages(){
           System.out.println( """

    1  - Write Messages
    2  - Inbox
    3  - outbox
    4  - picture messages
    5  - Templates
    6  - Smileys
    7  - messages setting
    8  - Info service
    9  - voice mailbox number
    10 - services command editor

    """);
      int userMessages = input.nextInt();

        switch(userMessages){

                case 1 : System.out.println("Search"); break;
                case 2 : System.out.println("Service Nos"); break;
                case 3 : System.out.println("Add Name"); break;
                case 4 : System.out.println("Earse"); break;
                case 5 : System.out.println("Edith"); break;
                case 6 : System.out.println("Assgn Tone"); break;
                case 7 : System.out.println("Send b`card"); break;
                default : System.out.println("invalid input");

        }



          }





} //ends the class





