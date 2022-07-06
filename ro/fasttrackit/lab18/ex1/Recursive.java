package ro.fasttrackit.lab18.ex1;

import java.util.stream.IntStream;

public class Recursive {

    int sumFirstN(int n) {
        if(n == 0) { return 0; }
        return n + sumFirstN( n -1 );
    }
    int sumFirstNEven(int n) {
        if (n == 1) {
            return 2;
        }
        return (2 *n + sumFirstNEven(n -1));
    }
    static boolean isPalindrome(String givenString) {
        if (givenString.length() == 0 || givenString.length() == 1)
            return true;
        if (givenString.charAt(0) == givenString.charAt(givenString.length() - 1))
            return isPalindrome(givenString.substring(1, givenString.length() - 1));
        return false;
    }

    int sumDiggits(int n){
        int sum = n % 10;
        if(n == 0)
        {
            return 0;
        }
            return sum + sumDiggits(n / 10);
    }
}
