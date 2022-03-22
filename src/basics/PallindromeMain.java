package basics;

public class PallindromeMain {

    public static void main(String args[])
    {
        Pallindrome pallindrome = new Pallindrome();

       System.out.println(pallindrome.isPallindrome(1001));

    }
}

class Pallindrome {

    public boolean isPallindrome(int x) {
        int rev = 0;
        int num = x;
        while (x > 0) {   // Complexity size of number
            int temp = x % 10;
            x = x / 10;
            rev = rev * 10 + temp;

        }

    
      return (num==rev);
}
}
