package recursion;

public class Subset {

    public static void main(String args[])
    {
        String s = "abc";

        subsets(s,"",0);
    }

    private static void subsets(String s, String s1, int i) {

        if(s.length()==i)
        {
            System.out.println(s1);
            return;
        }

        subsets(s,s1,i+1);

        subsets(s,s1+s.charAt(i),i+1);

    }
}
