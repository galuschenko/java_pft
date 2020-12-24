package ua.qa.pft.testingweb;

import java.math.BigInteger;

import static java.math.BigInteger.*;

public class NewLesson12 {
    public static void main(String[] args) {
        int n=1000;
        BigInteger fact = valueOf(1);
        factorial(n, fact, 1);
    }
    public static BigInteger factorial(int n, BigInteger fact, int k) {
        if (k<=n) {
            fact = fact.multiply(BigInteger.valueOf(k));
            k++;
            factorial(n, fact, k);
        } else {
            System.out.println(fact);
        }
        return fact;
    }







}
