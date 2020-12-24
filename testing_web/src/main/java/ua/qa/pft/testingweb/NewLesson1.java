package ua.qa.pft.testingweb;

import java.util.Arrays;

public class NewLesson1 {
    public static void main(String[] args) {
        int[] numbersUnsorted = {3,1,7};
        int t = 0;
        int [][] numbersSorted = new int[3][2];
        System.out.println("Basic data of numbers:\n" + "===================");
        for (int nU : numbersUnsorted) {
            System.out.println(nU);
        }
        System.out.println("===================");

        for (int i = 0; i < (numbersUnsorted.length); i++) {
            
            for (int ii = i; ii < numbersUnsorted.length; ii++) {
                if (i != ii) {
                    System.out.println(numbersUnsorted[i] + " " + numbersUnsorted[ii]);
                    numbersSorted[t][0]=numbersUnsorted[i];
                    numbersSorted[t][1]=numbersUnsorted[ii];
                    t++;
                }
            }
        }
        System.out.println(Arrays.deepToString(numbersSorted));
     }
}

