package basics;

import java.util.HashSet;
import java.util.LinkedHashSet;

class Sol {

    public static void main(String args[]) {
        removeDups("zvvo");
    }


       public static String removeDups(String S) {
           String[] str = S.split("");
           String string = "";
           HashSet<String> strHash = new LinkedHashSet<>(str.length-1);
           for (int i = 0; i < str.length; i++) {
               strHash.add(str[i]);

           }

           for (String s : strHash) {
               string = string + s;
           }



           return string;
       }

    }


