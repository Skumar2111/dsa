package basics;

import java.util.HashSet;

public class Duplicatetring {

    public static void main(String args[]) {
        String S="zvvo";
        String[] str = S.split("");
        String string ="";
        HashSet<String> strHash = new HashSet<>();
        for (int i = 0; i < str.length;i++)
        {
            if(!strHash.contains(str[i]))
            {
                strHash.add(str[i]);
                string = string + str[i];
            }

        }
        System.out.println(string);
    }
}
