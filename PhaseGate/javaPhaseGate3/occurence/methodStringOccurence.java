public class methodStringOccurence{

        public static int occurance(String words, char letter){
        String convert = words.toLowerCase();
        char [] character = convert.toCharArray();
        int count = 0;
        for(int i = 0; i<character.length; i++){

              //System.out.println(character[i]);
              if( letter == character[i]){
              count++;
              }

                  }
                  return count;

        }








}
