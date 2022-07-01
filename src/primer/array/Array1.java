package primer.array;

import java.util.HashMap;
import java.util.Map;

public class Array1 {
    public static void main(String[] args) {

        String st = new String("Helloll   hvjhhhh jjhjkllllbv   ff");

        int counter = 0;
        char[] charsArray = st.toCharArray();
        System.out.println("Повторяющиеся символы тут:");

        for (int i=0; i<st.length();i++) {
            for(int j=i+1; j<st.length();j++) {
                if (charsArray [i] == charsArray [j]) {
                    System.out.print(charsArray [j]);
                    counter ++;
                break;
                }

            }

        }


        //  krknvox bare@ teqstum
//        String string = "Big black bug  bit  a big black dog on his big black nose";
//        int count;
//
//        String words[] = string.split(" ");
//
//        System.out.println("Duplicate words in a given string : ");
//        for(int i = 0; i < words.length; i++) {
//            count = 1;
//            for(int j = i+1; j < words.length; j++) {
//                if(words[i].equals(words[j])) {
//                    count++;
//                    //Set words[j] to 0 to avoid printing visited word
//                    words[j] = "0";
//                }
//            }
//
//            //Displays the duplicate word if count is greater than 1
//            if(count > 1 && words[i] != "0")
//                System.out.println(words[i]);
//        }

    }
}
