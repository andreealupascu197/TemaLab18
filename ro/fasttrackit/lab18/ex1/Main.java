package ro.fasttrackit.lab18.ex1;

public class Main {
    public static void main(String[] args) {
        Interative operationInterative = new Interative();
        Recursive operationRecursive = new Recursive();

        System.out.println(operationInterative.sumFirstN(8));
        operationInterative.sumFirstNDeclarative(8);
        System.out.println(operationRecursive.sumFirstN(5));

        System.out.println(operationRecursive.sumFirstNEven(5));
        System.out.println(operationInterative.sumFirstNEven(5));

        System.out.println(Interative.isPalindrome("abba"));
        System.out.println(Interative.isPalindrome("casa"));
        System.out.println(Recursive.isPalindrome("abba"));
        System.out.println(Recursive.isPalindrome("casa"));

        System.out.println(operationInterative.sumDiggits(222));
        System.out.println(operationRecursive.sumDiggits(222));

        System.out.println(Interative.fibo(10));

    }
}
