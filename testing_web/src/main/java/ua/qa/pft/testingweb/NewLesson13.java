package ua.qa.pft.testingweb;

import java.math.BigInteger;

public class NewLesson13 {
    public static void main(String[] args) {
        int n = 1000;
        arithmeticProgression(n, BigInteger.valueOf(1), 1);

    }

    public static void arithmeticProgression(int n, BigInteger k, int i) {
        if (i<=n) {
            k = k.add(k);
            i++;
                System.out.println(k + " ");
                arithmeticProgression(n, k, i);

        }
    }





}



