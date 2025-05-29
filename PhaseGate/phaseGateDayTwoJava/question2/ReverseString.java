public class ReverseString {

            public static String reverseString(String words, String ch){

                int index = words.indexOf(ch);
                int myLength = words.length();

                String reversed = "";
                for (int i = index ; i >= 0; i--) {
                    reversed += words.charAt(i);
                }
                char [] character = words.toCharArray();
                 String  com = "";
                  for(int i = index +1; i<character.length; i++){

                      com += character[i];
                  }

                  String result = reversed + com;

                return result;

            }

}
