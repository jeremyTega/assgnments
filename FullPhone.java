import java.util.Scanner;

public class FullPhone {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
        ======================================
                  WELCOME TO TEGA'S PHONE
        ======================================

                   MAIN MENU

              1  -> Phone Book
              2  -> Messages
              3  -> Chat
              4  -> Call Register
              5  -> Tones
              6  -> Settings
              7  -> Call Divert
              8  -> Games
              9  -> Calculator
             10  -> Reminder
             11  -> Clock
             12  -> Profiles
             13  -> SIM Services
              0  -> Exit

        ======================================
            Kindly enter your choice below:
        ======================================
        """);
            int userInput = input.nextInt();
            if(userInput <0 || userInput > 13){
            System.out.println("please enter a valid number from 0 - 13");
            }


            switch (userInput) {
                case 1 -> PhoneBook();
                case 2 -> messages();
                case 3 -> chat();
                case 4 -> callRegister();
                case 5 -> Tones();
                case 6 -> Settings();
                case 7 -> CallDivert();
                case 8 -> Games();
                case 9 -> Calculator();
                case 10 -> Reminder();
                case 11 -> clock();
                case 12 -> Profiles();
                case 13 -> SimService();
                case 0 -> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }

                }




       }
    } //  main end

    //............................................................................

    public static void PhoneBook() {
       while(true){
        System.out.println("""
                1  - Search
                2  - Service Nos
                3  - Add Name
                4  - Erase
                5  - Edit
                6  - Assign Tone
                7  - Send b'card
                8  - Options
                9  - Speed dial
                10 - voice tags
                11 - enter 0 to go back to previous menu
                """);
        int phoneBookInput = input.nextInt();
         if( phoneBookInput > 11){
         System.out.println("invalid Number, pleas choose:");
        PhoneBook();
         }

        switch (phoneBookInput) {
            case 0 -> {
                main(null);
                    }
                    case 1 -> {
                        System.out.println("Search");
                        System.out.println("enter 0 to go back to previous menu");
                        int enterNumber = input.nextInt();
                        if (enterNumber == 0) {
                            PhoneBook();
                        } else {
                            System.out.println("invalid number");
                        }
                break;
            }
            case 2 -> {
                System.out.println("Service Nos");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
                    }
                    case 3 -> {
                        System.out.println("Add Name");
                        System.out.println("enter 0 to go back to previous menu");
                        int enterNumber = input.nextInt();
                        if (enterNumber == 0) {
                            PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 4 -> {
                System.out.println("Erase");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
                    }
                    case 5 -> {
                        System.out.println("Edit");
                        System.out.println("enter 0 to go back to previous menu");
                        int enterNumber = input.nextInt();
                        if (enterNumber == 0) {
                            PhoneBook();
                        } else {
                            System.out.println("invalid number");
                }
                break;
            }
                    case 6 -> {
                        System.out.println("Assign Tone");
                        System.out.println("enter 0 to go back to previous menu");
                        int enterNumber = input.nextInt();
                        if (enterNumber == 0) {
                                                PhoneBook();
                        } else {
                            System.out.println("invalid number");
                        }
                        break;
                    }
            case 7 -> {
                System.out.println("Send b'card");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }

            case 8 -> optionEight();

            case 9 -> {
                System.out.println("Speed dial");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 10 -> {
                System.out.println("Voice tags");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            default ->

            System.out.println("invalid input");


        }

    }
    }

    //............................................................................

  public static void messages() {
    while (true) {
        System.out.println("""
                1  - Write Messages
                2  - Inbox
                3  - Outbox
                4  - Picture messages
                5  - Templates
                6  - Smileys
                7  - Messages setting
                8  - Info service
                9  - Voice mailbox number
                10 - Services command editor
                0  - Go back to previous menu
                """);

        int userMessages = input.nextInt();

        switch (userMessages) {
            case 0 -> {
                        return;
                    }
                    case 1 -> {
                        while (true) {
                            System.out.println("Write Messages");
                            System.out.println("Enter 0 to go back to messages menu");
                            int enterNumber = input.nextInt();
                            if (enterNumber == 0) break;
                            else System.out.println("Invalid number");
                        }
                    }
            case 2 -> {
                while (true) {
                    System.out.println("Inbox");
                    System.out.println("Enter 0 to go back to messages menu");
                    int enterNumber = input.nextInt();
                    if (enterNumber == 0) break;
                    else System.out.println("Invalid number");
                }
                }
                case 3 -> {
                    while (true) {
                        System.out.println("Outbox");
                        System.out.println("Enter 0 to go back to messages menu");
                        int enterNumber = input.nextInt();
                        if (enterNumber == 0) break;
                        else System.out.println("Invalid number");
                    }
                        }
                    case 4 -> {
                        while (true) {
                            System.out.println("Picture messages");
                            System.out.println("Enter 0 to go back to messages menu");
                            int enterNumber = input.nextInt();
                            if (enterNumber == 0) break;
                            else System.out.println("Invalid number");
                        }
                    }
                    case 5 -> {
                        while (true) {
                    System.out.println("Templates");
                    System.out.println("Enter 0 to go back to messages menu");
                    int enterNumber = input.nextInt();
                    if (enterNumber == 0) break;
                    else System.out.println("Invalid number");
                }
            }
            case 6 -> {
                while (true) {
                    System.out.println("Smileys");
                    System.out.println("Enter 0 to go back to messages menu");
                    int enterNumber = input.nextInt();
                    if (enterNumber == 0) break;
                    else System.out.println("Invalid number");
                }
            }
            case 7 -> {
                optionSeven();
            }
            case 8 -> {
                while (true) {
                    System.out.println("Info service");
                    System.out.println("Enter 0 to go back to messages menu");
                    int enterNumber = input.nextInt();
                    if (enterNumber == 0) break;
                    else System.out.println("Invalid number");
                }
            }
            case 9 -> {
                while (true) {
                    System.out.println("Voice mailbox number");
                    System.out.println("Enter 0 to go back to messages menu");
                    int enterNumber = input.nextInt();
                    if (enterNumber == 0) break;
                    else System.out.println("Invalid number");
                }
            }
            case 10 -> {
                while (true) {
                    System.out.println("Service command editor");
                    System.out.println("Enter 0 to go back to messages menu");
                    int enterNumber = input.nextInt();
                    if (enterNumber == 0) break;
                    else System.out.println("Invalid number");
                }
            }
            default -> System.out.println("Invalid input. Please enter a number between 0 and 10.");
        }
    }
}


//............................................................................

public static void chat(){

 while (true) {

          System.out.println("Chat");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
             continue;
             }
          }


}



//............................................................................


public static void callRegister() {
    while (true) {
        System.out.println("""
                1  - Missed calls
                2  - Received calls
                3  - Dialed Numbers
                4  - Erase recent call list
                5  - Show call duration
                6  - Show call cost
                7  - Call cost setting
                8  - Prepaid credit
                0  - Go back to main menu
                """);

            int inputOption = input.nextInt();

            switch (inputOption) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    while (true) {
                    System.out.println("Missed calls");
                    System.out.println("Enter 0 to go back");
                    if (input.nextInt() == 0) break;
                    else System.out.println("Invalid number");
                }
            }
            case 2 -> {
                        while (true) {
                            System.out.println("Received calls");
                            System.out.println("Enter 0 to go back");
                            if (input.nextInt() == 0) break;
                            else System.out.println("Invalid number");
                        }
                    }
                    case 3 -> {
                while (true) {
                    System.out.println("Dialed Numbers");
                    System.out.println("Enter 0 to go back");
                    if (input.nextInt() == 0) break;
                    else System.out.println("Invalid number");
                }
            }
            case 4 -> {
                while (true) {
                    System.out.println("Erase recent call list");
                    System.out.println("Enter 0 to go back");
                    if (input.nextInt() == 0) break;
                    else System.out.println("Invalid number");
                }
            }
            case 5 -> {
                optionFive();
            }
            case 6 -> {
                while (true) {
                    System.out.println("""
                            1  - Show last call
                            2  - All call cost
                            3  - Clear counters
                            0  - Go back
                            99 - Go to main menu
                            """);
                    int choice = input.nextInt();
                    switch (choice) {
                        case 0 -> {
                            break;
                        }
                        case 99 -> {
                            main(null);
                            return;
                        }
                        case 1 -> {
                            while (true) {
                                System.out.println("Show last call");
                                System.out.println("Enter 0 to go back");
                                if (input.nextInt() == 0) break;
                                else System.out.println("Invalid number");
                            }
                        }
                        case 2 -> {
                            while (true) {
                                System.out.println("All call cost");
                                System.out.println("Enter 0 to go back");
                                if (input.nextInt() == 0) break;
                                else System.out.println("Invalid number");
                                }
                            }
                            case 3 -> {
                                while (true) {
                                    System.out.println("Clear counters");
                                    System.out.println("Enter 0 to go back");
                                    if (input.nextInt() == 0) break;
                                    else System.out.println("Invalid number");
                                }
                            }
                            default -> System.out.println("Invalid input");
                        }
                        if (choice == 0) break;
                }
            }
            case 7 -> {
                while (true) {
                    System.out.println("""
                            1  - Call cost limits
                            2  - Show cost in
                            0  - Go back
                            99 - Go to main menu
                            """);
                    int choice = input.nextInt();
                        switch (choice) {
                            case 0 -> {
                                break;
                            }
                            case 99 -> {
                                main(null);
                                return;
                            }
                            case 1 -> {
                                while (true) {
                                System.out.println("Call cost limits");
                                System.out.println("Enter 0 to go back");
                                if (input.nextInt() == 0) break;
                                else System.out.println("Invalid number");
                            }
                        }
                        case 2 -> {
                                    while (true) {
                                        System.out.println("Show cost in");
                                        System.out.println("Enter 0 to go back");
                                        if (input.nextInt() == 0) break;
                                        else System.out.println("Invalid number");
                                    }
                                }
                                default -> System.out.println("Invalid input");
                            }
                            if (choice == 0) break;
                        }
                    }
            case 8 -> {
                while (true) {
                    System.out.println("Prepaid credit");
                    System.out.println("Enter 0 to go back");
                    if (input.nextInt() == 0) break;
                    else System.out.println("Invalid number");
                }
            }
            default -> System.out.println("Invalid input. Choose between 0–8.");
        }
    }
}

//............................................................................

 public static void Tones() {
    while (true) {
        // Display the options menu
        System.out.println("""
            1  - Ringing tone
            2  - Ringing volume
            3  - Incoming call alert
            4  - Composer
            5  - Messages alert tone
            6  - Keypad tones
            7  - Warning and games tones
            8  - Vibrating alert
            9  - Screen saver
            10 - Enter 0 to go back to previous menu
        """);

        // Get user input
        int userTones = input.nextInt();

        switch (userTones) {
            case 0: {
                main(null);
                return;
            }
            case 1: {
            while (true) {
                System.out.println("Ringing tone");
                System.out.println("Enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    Tones();
                } else {
                    System.out.println("Invalid number");
                    continue;
                }

                }
                    }
                    case 2: {
                    while (true) {
                        System.out.println("Ringing volume");
                        System.out.println("Enter 0 to go back to previous menu");
                        int enterNumber = input.nextInt();
                        if (enterNumber == 0) {
                            Tones();
                        } else {
                            System.out.println("Invalid number");
                            continue;
                        }
                        }
                    }
            case 3: {
             while (true) {
                System.out.println("Incoming call alert");
                System.out.println("Enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                  Tones();
                } else {
                    System.out.println("Invalid number");
                    continue;
                }
               }
            }
            case 4: {
             while (true) {
                System.out.println("Composer");
                System.out.println("Enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    Tones();
                } else {
                    System.out.println("Invalid number");
                    continue;
                }
                }
            }
                    case 5: {
                    while (true) {
                        System.out.println("Messages alert tone");
                        System.out.println("Enter 0 to go back to previous menu");
                        int enterNumber = input.nextInt();
                        if (enterNumber == 0) {
                            Tones();
                        } else {
                            System.out.println("Invalid number");
                            continue;
                        }
                        }
            }
            case 6: {
             while (true) {
                System.out.println("Keypad tones");
                System.out.println("Enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    Tones();
                } else {
                    System.out.println("Invalid number");
                    continue;
                }
                }
            }
                    case 7: {
                    while (true) {
                        System.out.println("Warning and games tones");
                        System.out.println("Enter 0 to go back to previous menu");
                        int enterNumber = input.nextInt();
                        if (enterNumber == 0) {
                            Tones();
                        } else {
                            System.out.println("Invalid number");
                            continue;
                        }
                    }
                    }
                    case 8: {
                    while (true) {
                        System.out.println("Vibrating alert");
                System.out.println("Enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    Tones();
                } else {
                    System.out.println("Invalid number");
                    continue;
                }
                }
            }
            case 9: {
             while (true) {
                System.out.println("Screen saver");
                System.out.println("Enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                   Tones();
                } else {
                    System.out.println("Invalid number");
                    continue;
                }
                }
            }
            default: {
                System.out.println("Invalid input");

                break;
            }
        }
    }
}



//............................................................................
    public static void Settings() {
        while (true) {
            System.out.println("""
                1  - Call setting
                2  - Phone setting
                3  - Security setting
                4  - Restore factory setting
                0  - Go back to previous menu
            """);

            int userTones = input.nextInt();

            switch (userTones) {
                case 0:
                    return;

                case 1:
                    while (true) {
                        System.out.println("""
                            1  - Automatic redial
                            2  - Speed dialing
                            3  - Call waiting response
                            4  - Own number sending
                            5  - Phone line in use
                            6  - Automatic answer
                            0  - Go back
                        """);
                            int callSetting = input.nextInt();
                            if (callSetting == 0) break;

                            switch (callSetting) {
                                case 1: {
                                    while (true) {
                                        System.out.println("Automatic redial");
                                        System.out.println("Enter 0 to go back to previous menu:");
                                        int back = input.nextInt();
                                        if (back == 0) break;
                                        else System.out.println("Invalid number");
                                }
                                break;
                            }
                                    case 2: {
                                        while (true) {
                                            System.out.println("Speed dialing");
                                            System.out.println("Enter 0 to go back to previous menu:");
                                            int back = input.nextInt();
                                            if (back == 0) break;
                                            else System.out.println("Invalid number");
                                        }
                                        break;
                                    }
                                    case 3: {
                                        while (true) {
                                            System.out.println("Call waiting response");
                                    System.out.println("Enter 0 to go back to previous menu:");
                                    int back = input.nextInt();
                                    if (back == 0) break;
                                    else System.out.println("Invalid number");
                                }
                                break;
                            }
                            case 4: {
                                while (true) {
                                    System.out.println("Own number sending");
                                    System.out.println("Enter 0 to go back to previous menu:");
                                    int back = input.nextInt();
                                    if (back == 0) break;
                                    else System.out.println("Invalid number");
                                        }
                                        break;
                                    }
                                    case 5: {
                                        while (true) {
                                            System.out.println("Phone line in use");
                                            System.out.println("Enter 0 to go back to previous menu:");
                                            int back = input.nextInt();
                                            if (back == 0) break;
                                            else System.out.println("Invalid number");
                                        }
                                break;
                            }
                            case 6: {
                                while (true) {
                                    System.out.println("Automatic answer");
                                    System.out.println("Enter 0 to go back to previous menu:");
                                    int back = input.nextInt();
                                    if (back == 0) break;
                                    else System.out.println("Invalid number");
                                }
                                break;
                            }
                            default:
                                System.out.println("Invalid input");
                        }
                    }
                    break;

                case 2:
                        while (true) {
                            System.out.println("""
                                1  - Language
                                2  - Cell info display
                                3  - Welcome note
                                4  - Network selection
                                5  - Lights
                                6  - Confirm SIM service actions
                                0  - Go back
                            """);
                        int phoneSetting = input.nextInt();
                        if (phoneSetting == 0) break;

                        switch (phoneSetting) {
                                    case 1: {
                                        while (true) {
                                            System.out.println("Language");
                                            System.out.println("Enter 0 to go back to previous menu:");
                                            int back = input.nextInt();
                                    if (back == 0) break;
                                    else System.out.println("Invalid number");
                                }
                                break;
                            }
                            case 2: {
                                while (true) {
                                    System.out.println("Cell info display");
                                    System.out.println("Enter 0 to go back to previous menu:");
                                    int back = input.nextInt();
                                    if (back == 0) break;
                                    else System.out.println("Invalid number");
                                }
                                break;
                            }
                                    case 3: {
                                        while (true) {
                                                    System.out.println("Welcome note");
                                                    System.out.println("Enter 0 to go back to previous menu:");
                                                    int back = input.nextInt();
                                                    if (back == 0) break;
                                                    else System.out.println("Invalid number");
                                                }
                                                break;
                                    }
                                    case 4: {
                                        while (true) {
                                            System.out.println("Network selection");
                                            System.out.println("Enter 0 to go back to previous menu:");
                                            int back = input.nextInt();
                                            if (back == 0) break;
                                            else System.out.println("Invalid number");
                                        }
                                        break;
                                    }
                                    case 5: {
                                        while (true) {
                                            System.out.println("Lights");
                                            System.out.println("Enter 0 to go back to previous menu:");
                                            int back = input.nextInt();
                                            if (back == 0) break;
                                    else System.out.println("Invalid number");
                                }
                                break;
                            }
                            case 6: {
                                while (true) {
                        System.out.println("Confirm SIM service actions");
                            System.out.println("Enter 0 to go back to previous menu:");
                        int back = input.nextInt();
                                    if (back == 0) break;
                            else System.out.println("Invalid number");
                                }
                                break;
        }
                            default:
                                System.out.println("Invalid input");
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.println("""
                            1  - PIN code request
                            2  - Call barring service
                            3  - Fixed dialing
                            4  - Closed user group
                            5  - Phone security
                            6  - Change access codes
                            0  - Go back
                        """);
                        int securitySetting = input.nextInt();
                        if (securitySetting == 0) break;

                        switch (securitySetting) {
                            case 1: {
                                while (true) {
                                    System.out.println("PIN code request");
                                    System.out.println("Enter 0 to go back to previous menu:");
                                            int back = input.nextInt();
                                            if (back == 0) break;
                                            else System.out.println("Invalid number");
                                        }
                                        break;
                                    }
                                    case 2: {
                                        while (true) {
                                            System.out.println("Call barring service");
                                            System.out.println("Enter 0 to go back to previous menu:");
                                            int back = input.nextInt();
                                            if (back == 0) break;
                                            else System.out.println("Invalid number");
                                        }
                                        break;
                                    }
                                    case 3: {
                                        while (true) {
                                    System.out.println("Fixed dialing");
                                    System.out.println("Enter 0 to go back to previous menu:");
                                    int back = input.nextInt();
                                    if (back == 0) break;
                                    else System.out.println("Invalid number");
                                }
                                break;
                            }
                            case 4: {
                                while (true) {
                                    System.out.println("Closed user group");
                                    System.out.println("Enter 0 to go back to previous menu:");
                                    int back = input.nextInt();
                                    if (back == 0) break;
                                    else System.out.println("Invalid number");
                                        }
                                        break;
                                    }
                                    case 5: {
                                        while (true) {
                                            System.out.println("Phone security");
                                            System.out.println("Enter 0 to go back to previous menu:");
                                            int back = input.nextInt();
                                            if (back == 0) break;
                                            else System.out.println("Invalid number");
                                        }
                                        break;
                                    }
                                    case 6: {
                                        while (true) {
                                            System.out.println("Change access codes");
                                            System.out.println("Enter 0 to go back to previous menu:");
                                            int back = input.nextInt();
                                            if (back == 0) break;
                                            else System.out.println("Invalid number");
                                        }
                                        break;
                                    }
                                    default:
                                        System.out.println("Invalid input");
                                }
                            }
                            break;

                case 4:
                    while (true) {
                        System.out.println("Restore factory settings");
                        System.out.println("Enter 0 to go back to previous menu:");
                        int back = input.nextInt();
                        if (back == 0) break;
                                else System.out.println("Invalid number");
                            }
                            break;

                        default:
                            System.out.println("Invalid input");
                    }
                }
            }




//............................................................................

public static void CallDivert(){
 while (true) {


          System.out.println("Call Divert");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
             continue;
          }
          }

}



//............................................................................

public static void Games(){
 while (true) {


          System.out.println("Games");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
             continue;
          }
}
}



//............................................................................


public static void Calculator(){
 while (true) {


          System.out.println("Calculator");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
             continue;
          }
          }

}



//............................................................................


public static void Reminder(){
 while (true) {


          System.out.println("Reminder");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
             continue;
          }
          }

}



//............................................................................

public static void clock() {
    while (true) {
        System.out.println("""
            1  - Alarm clock
            2  - Clock setting
            3  - Date setting
            4  - Stopwatch
            5  - Countdown timer
            6  - Auto update of date and time
            0  - Go back to previous menu
        """);

        int userInput = input.nextInt();

                switch (userInput) {
                    case 0 -> {
                        return;
                    }
                    case 1 -> {
                while (true) {
                    System.out.println("Alarm clock");
                    System.out.println("Enter 0 to go back to previous menu:");
                    int back = input.nextInt();
                    if (back == 0) break;
                    else System.out.println("Invalid number");
                }
            }
                    case 2 -> {
                        while (true) {
                            System.out.println("Clock setting");
                            System.out.println("Enter 0 to go back to previous menu:");
                            int back = input.nextInt();
                            if (back == 0) break;
                            else System.out.println("Invalid number");
                        }
                    }
                    case 3 -> {
                while (true) {
                    System.out.println("Date setting");
                    System.out.println("Enter 0 to go back to previous menu:");
                    int back = input.nextInt();
                    if (back == 0) break;
                    else System.out.println("Invalid number");
                }
            }
            case 4 -> {
                        while (true) {
                            System.out.println("Stopwatch");
                            System.out.println("Enter 0 to go back to previous menu:");
                            int back = input.nextInt();
                            if (back == 0) break;
                            else System.out.println("Invalid number");
                        }
            }
            case 5 -> {
                while (true) {
                    System.out.println("Countdown timer");
                    System.out.println("Enter 0 to go back to previous menu:");
                    int back = input.nextInt();
                    if (back == 0) break;
                    else System.out.println("Invalid number");
                }
            }
                    case 6 -> {
                        while (true) {
                            System.out.println("Auto update of date and time");
                            System.out.println("Enter 0 to go back to previous menu:");
                            int back = input.nextInt();
                            if (back == 0) break;
                            else System.out.println("Invalid number");
                        }
                    }
                    default -> System.out.println("Invalid input. Please choose 0–6.");
        }
    }
}


//............................................................................


public static void Profiles(){
while (true) {


          System.out.println("Profiles");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
             continue;
          }
          }

}
//............................................................................
public static void SimService(){
while (true) {


          System.out.println("SimService");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
             continue;
          }
          }

}
//............................................................................
public static void optionEight(){
while(true){
    System.out.println("""
                        1  -> Type of view
                        2  -> Memory status
                           -> enter 0 to go back to previous menu
                           -> enter 99 to go back to main menu
                        """);

                int card = input.nextInt();

                switch (card) {
                    case 99 -> main(null);
                    case 0 -> PhoneBook();

                    case 1 -> {
            while(true){
                        System.out.println("Type of view");
                        System.out.println("enter 0 to go back to previous menu");
                        int enterNumber = input.nextInt();
                        if (enterNumber == 0) {
                           optionEight();
                        } else {
                            System.out.println("invalid number");
                            continue;
                        }
                        //break;
                        }

                    }

                    case 2 -> {
                     while(true){
                        System.out.println("Memory status");
                        System.out.println("enter 0 to go back to previous menu");
                        int enterNumber = input.nextInt();
                        if (enterNumber == 0) {
                             optionEight();
                        } else {
                            System.out.println("invalid number");
                            continue;
                        }

                    }
                    }
                    default -> System.out.println("invalid input");


}
}
}

public static void optionSeven() {
    while (true) {
        System.out.println("""
                1 -> Set 1
                2 -> Common
                0 -> Go back to messages menu
                99 -> Go back to main menu
                """);

        int messageSetting = input.nextInt();

        switch (messageSetting) {
            case 0 -> {
                return;
            }
            case 99 -> {
                main(null);
                return;
            }
            case 1 -> {
                while (true) {
                    System.out.println("""
                            1 - Message center number
                            2 - Message sent as
                            3 - Message validity
                            0 - Go back to previous menu
                            99 - Go back to main menu
                            """);

                    int set = input.nextInt();

                    switch (set) {
                        case 0 -> {
                            break;
                        }
                        case 99 -> {
                            main(null);
                            return;
                        }
                        case 1 -> {
                            while (true) {
                                System.out.println("Message center number");
                                System.out.println("Enter 0 to go back");
                                int back = input.nextInt();
                                if (back == 0) break;
                                else System.out.println("Invalid number");
                            }
                        }
                                case 2 -> {
                                    while (true) {
                                        System.out.println("Message sent as");
                                        System.out.println("Enter 0 to go back");
                                        int back = input.nextInt();
                                        if (back == 0) break;
                                        else System.out.println("Invalid number");
                                    }
                                }
                                case 3 -> {
                            while (true) {
                                System.out.println("Message validity");
                                System.out.println("Enter 0 to go back");
                                int back = input.nextInt();
                                if (back == 0) break;
                                else System.out.println("Invalid number");
                            }
                        }
                        default -> System.out.println("Invalid input");
                    }

                    if (set == 0) break;
                }
            }
            case 2 -> {
                while (true) {
                    System.out.println("""
                            1 - Delivery report
                            2 - Reply via same center
                            3 - Character support
                            0 - Go back to previous menu
                            99 - Go back to main menu
                            """);

                    int common = input.nextInt();

                    switch (common) {
                        case 0 -> {
                            break;
                        }
                        case 99 -> {
                            main(null);
                            return;
                        }
                        case 1 -> {
                            while (true) {
                                System.out.println("Delivery report");
                                System.out.println("Enter 0 to go back");
                                int back = input.nextInt();
                                if (back == 0) break;
                                else System.out.println("Invalid number");
                            }
                        }
                                    case 2 -> {
                                        while (true) {
                                            System.out.println("Reply via same center");
                                            System.out.println("Enter 0 to go back");
                                            int back = input.nextInt();
                                            if (back == 0) break;
                                            else System.out.println("Invalid number");
                                                }
                                            }
                                case 3 -> {
                                    while (true) {
                                        System.out.println("Character support");
                                        System.out.println("Enter 0 to go back");
                                        int back = input.nextInt();
                                        if (back == 0) break;
                                        else System.out.println("Invalid number");
                                    }
                                }
                                default -> System.out.println("Invalid input");
                            }

                        if (common == 0) break;
                    }
            }
            default -> System.out.println("Invalid input. Please select 1, 2, 0 or 99.");
        }
    }
}


 //.....................................................................................................................................
          public static void optionFive() {
    while (true) {
        System.out.println("""
                1  - Last call duration
                2  - All call's duration
                3  - Received call's duration
                4  - Dialed call's duration
                5  - Clear counters
                0  - Go back to previous menu
                99 - Go back to main menu
                """);

        int callDuration = input.nextInt();

        switch (callDuration) {
                        case 0 -> {
                            return;
                        }
                            case 99 -> {
                                main(null);
                                return;
                            }
            case 1 -> {
                while (true) {
                    System.out.println("Last call duration");
                    System.out.println("Enter 0 to go back");
                    int back = input.nextInt();
                    if (back == 0) break;
                    else System.out.println("Invalid number");
                }
            }
            case 2 -> {
                while (true) {
                    System.out.println("All call's duration");
                    System.out.println("Enter 0 to go back");
                    int back = input.nextInt();
                    if (back == 0) break;
                    else System.out.println("Invalid number");
                }
            }
            case 3 -> {
                while (true) {
                    System.out.println("Received call's duration");
                    System.out.println("Enter 0 to go back");
                    int back = input.nextInt();
                    if (back == 0) break;
                    else System.out.println("Invalid number");
                }
            }
            case 4 -> {
                while (true) {
                    System.out.println("Dialed call's duration");
                    System.out.println("Enter 0 to go back");
                    int back = input.nextInt();
                    if (back == 0) break;
                    else System.out.println("Invalid number");
                }
            }
                        case 5 -> {
                            while (true) {
                                System.out.println("Clear counters");
                                System.out.println("Enter 0 to go back");
                                int back = input.nextInt();
                                if (back == 0) break;
                                else System.out.println("Invalid number");
                            }
                        }
            default -> System.out.println("Invalid input. Please choose 0–5 or 99.");
        }
    }
}







} //ends the class





