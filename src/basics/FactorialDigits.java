package basics;

public class FactorialDigits {

    public static void main(String args[]) {

        Fact fact = new Fact();
        System.out.println(fact.digitsInFactorial(5));
    }
}

class Fact {
    public int digitsInFactorial(int N) {
        // code here

        if (N < 0)
            return 0;

        if (N <= 1)
            return 1;

        double digitCount = 0;
        for (int i = 2; i <= N; i++) {
            digitCount += Math.log10(i);
        }

        return (int) Math.floor(digitCount) + 1;
    }
}





