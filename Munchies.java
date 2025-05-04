
        public class Munchies{

        public static  int findMultiple(int number){
        return number * 5;
        }



        public static boolean isPrime(int number){
        if (number <1 ) return false;
        for (int i = 2; i < number /2; i++){
        if(number % i == 0) return false;
        }
        return true;
        }



         public static void displayPrimeNumbers() {
        int count = 0;
        int number = 2;

        while (count < 50) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }



            public static String displayAge(int ageYears){
            int Age = ageYears * 1;
            int months = ageYears * 12;
            int days = ageYears * 365;
            int minute = days * 1440;
            int second = minute * 60;
            return
            "Age: "+ ageYears + "year(s),"  + months + "months," + days + "days," + minute + "minutes," + second + "seconds.";
            }



            public static String displayDogAge(String name, int humanYears){
            int dog  = humanYears * 7;

            return name + " is "+ dog + "years old ";


            }


            public static int computeSumOfNumber(int number) {

            int addedNumber  = 0;
            while(number >0){
            addedNumber += number % 10;
            number /= 10;
            }
            return addedNumber;


            }


            public static boolean isLeapYear(int year){
            return(year % 4 == 0 ) || (year % 400 == 0);
            }





}
