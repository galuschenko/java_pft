package ua.qa.pft.testingweb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewLesson3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 10000;
        List<Integer> primeNumbers = new ArrayList<Integer>();
        System.out.println("================================================================================\n" +
                "*****ADVERTISING INTEGRATION*****. \nIf you type with one hand and the other with your free hand, do not forget about http://pornhub.com\n" +
                "================================================================================\n" +
                "Start from a = " + a + "\nEnd before b = " + b);
//        System.out.println("Start from a = " + a + "\nEnd before b = " + b);
        for (int i = a; i<=b; i++){
            boolean prime = true;
            for (int j = a; j < i; j++) {
                if (j!=0 && j!=1 && i % j == 0) {
                    prime = false;
                }
            }
            if (prime == true) {
                if (i==0 | i==1){

                } else {
                    System.out.print(i + ", ");
                }
//                System.out.println("==============================================\n" + i + " - prime\n==============================================");

            }
//            else {
//                System.out.println(i + " - not prime");
//            }
        }
    }
}
