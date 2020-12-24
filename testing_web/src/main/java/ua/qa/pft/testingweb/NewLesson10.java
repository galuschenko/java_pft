package ua.qa.pft.testingweb;

import java.math.BigInteger;
import java.util.Arrays;

public class NewLesson10 {
    public static void main(String[] args) {
      //  System.out.println(factorial(10));
        int [] a1 = {1, 4, 10};
        int [] a2 = {1, 2};

        //System.out.println(Arrays.toString(mergeArrays(a1, a2)));
        System.out.println(Arrays.toString(mergeArraysJul(a1, a2)));

    }

    public static BigInteger factorial(int value) {
        switch (value) {
            case 0:
                return BigInteger.valueOf(0);
            default:
                BigInteger container = BigInteger.valueOf(1);
                for (int i = 1; i <= value; i++) {
                    container = container.multiply(BigInteger.valueOf(i));
                }
                return container; // your implementation here
        }
    }

    public static int[] mergeArraysJul(int[] a, int[] b) {
        int[] finalMassive = new int[a.length+b.length];
        int i, j;
        if (a.length > b.length) {
            int[] c = b;
            b = a;
            a = c;
        }

        i = a.length - 1;
        j = b.length - 1;

        int f = finalMassive.length - 1;

        while (j >= 0) {
            if (i >= 0 && a[i] > b[j]) {
                finalMassive[f] = a[i];
                i--;
            } else {
                finalMassive[f] = b[j];
                j--;
            }
            f--;
        }


    return finalMassive;
    }


    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a1a2 = new int[(a1.length + a2.length)];
        if (a1.length == 0) {
            a1a2 = a2;
        } else if (a2.length == 0) {
            a1a2 = a1;
        }
        int container = 0;
        for (int i = 0; i < a2.length; i++) {
            a1a2[i] = a2[i];
        }
        for (int i = 0; i < a1.length; i++) {
            for (int k = 0; k<a1a2.length; k++) {
                if (a1[i] <= a1a2[k]) {
                    int a = a1a2.length - k-1;
                    for (int j = 0; j < a; j++) {
                        a1a2[(a1a2.length-j-1)] = a1a2[(a1a2.length - (2+j))];

                    }
                    a1a2[k] = a1[i];
                    break;
            }

            }
        } return a1a2;

        }


    /*public static int[] mergeArrays(int[] a1, int[] a2) {
        int [] a1a2 = new int[(a1.length + a2.length)];
        int counterOfa1a2 = 0;
        int smallerValue = 0;

        if (a1.length == 0) {
            a1a2 = a2;
        } else
        if (a2.length == 0) {
            a1a2 = a1;
        }
        for (int i = 0; i<a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
            if (a1[i] > a2[j]) {
                smallerValue = a2[j];
            } else {
                smallerValue = a1[i];
            }
            }
          a1a2[counterOfa1a2] = smallerValue;
            counterOfa1a2++;
        }
        return a1a2; // your implementation here
    }
//    int [] a1 = {1, 3, 6};
//    int [] a2 = {4, 5};
    public static int[] mergeArraysJuls(int[] a1, int[] a2) {
        int[] finalArray = new int[a1.length+a2.length];
        int

        int counter=0;
        int counter2 = 0;
        int k = 0;



        int tail = a2.length-a1.length;
        while (){
            if(a1[counter]<a2[counter2]){
                finalArray[k] = a1[counter];
                k++;
                counter++;
            }if(a1[counter]== a2[counter2]){
                finalArray[k] = a1[counter];
                k++;
                finalArray[k] = a2[counter2];
                k++;

            }if(a1[counter]>a2[counter2]){
                finalArray[k] = a2[counter2];
                k++;
                counter2++;
            }
        }

        while (tail>=0){
            int l = a2.length - tail;
            finalArray[l] = a2[l];
            tail--;
        }

        return finalArray; // your implementation here
    }*/

}

