package ro.fasttrackit.lab18.ex1;

import java.util.stream.IntStream;

public class Interative {

    int sumFirstN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public void sumFirstNDeclarative(int n) {
        int sum = IntStream.rangeClosed(0, n).sum();
        System.out.println("Sum = " + sum);
    }

    int sumFirstNEven(int n) {
        int sumFirstEven = 0;
        int evenNumber = 2;
        for (int i = 1; i <= n; i++) {
            sumFirstEven += evenNumber;
            evenNumber += 2;
        }
        return sumFirstEven;
    }


    public static boolean isPalindrome(String givenString) {

        String reverseString = "";
        boolean isPolindrome = false;
        for (int i = givenString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + givenString.charAt(i);
        }
        if (givenString.equals(reverseString)) {
            isPolindrome = true;
        }
        return isPolindrome;
    }

    int sumDiggits(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static int fibo(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 0;

        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}