package ua.qa.pft.testingweb;

import java.util.Arrays;

public class NewLesson15 {
    public static void main(String[] args) {
        int[] firstArray = {0, 1, 101};
        int[] secondArray = {5, 7, 9, 13,100};
        System.out.println(Arrays.toString(mergeArrays(firstArray, secondArray)));
    }

 /*   public static int[] mergeArraysJul (int[] firstArray, int[]secondArray) {
       int resultLenght = firstArray.length+secondArray.length;
        int[]resultArray = new int[resultLenght];
        int l1 = 0;
        int l2 = 0;
        for (int i = 0; i< resultLenght;i++){
            if(firstArray[l1]<secondArray[l2] && l1<firstArray.length-1){
                resultArray[i]=firstArray[l1];
                l1++;
            }else if(firstArray[l1]>secondArray[l2] && l2<secondArray.length-1){
                resultArray[i]=secondArray[l2];
                l2++;
            }else if(firstArray[l1]==secondArray[l2] && l2<secondArray.length-1 && l2<secondArray.length-1 && i<resultLenght-1){
                resultArray[i]=firstArray[l1];
                l1++;
                i++;
                resultArray[i]=secondArray[l2];
                l2++;

            }else if(firstArray[l1]<secondArray[l2] && l1==firstArray.length-1 && l2<secondArray.length-1 && i<resultLenght-1){
                resultArray[i]=secondArray[l1];
                i++;
                l2++;
            }else if(l2==secondArray.length-1 && l1<firstArray.length-1){
                resultArray[i]=secondArray[l1];
                l1++;
            }
        }

        return resultArray;
        }*/


    public static int[] mergeArrays(int[] firstArray, int[] secondArray) {
        int[] resultArray = new int[firstArray.length + secondArray.length];
        if (firstArray.length == 0){
            resultArray = secondArray;
        }
        if (secondArray.length ==0){
            resultArray = firstArray;
        } else {
            int r = 0;
            int f = 0;
            int s = 0;
            while (r < resultArray.length) {
                if (firstArray[f] < secondArray[s]) {
                    resultArray[r] = firstArray[f];
                    r++;
                    f++;
                    if (f >= firstArray.length) {
                        break;
                    }
                } else if (firstArray[f] == secondArray[s]) {
                    resultArray[r] = firstArray[f];
                    resultArray[r + 1] = secondArray[s];
                    r = r + 2;
                    f++;
                    s++;
                    if (f >= firstArray.length || s >= secondArray.length) {
                        break;
                    }
                } else if (firstArray[f] > secondArray[s]) {
                    resultArray[r] = secondArray[s];
                    r++;
                    s++;
                    if (s >= secondArray.length) {
                        break;
                    }
                }
            }
            if (f <= firstArray.length - 1) {
                for (int i = f; i < firstArray.length; i++) {
                    resultArray[r] = firstArray[i];
                    r++;
                }
            }
            if (s <= secondArray.length) {
                for (int i = s; i < secondArray.length; i++) {
                    resultArray[r] = secondArray[i];
                    r++;
                }
            }

        }
        return resultArray;
    }
}





 /*      int[]resultArray = new int[firstArray.length+secondArray.length];
       if (firstArray.length == 0){
           resultArray = secondArray;
       }
       if (secondArray.length ==0){
           resultArray = firstArray;
       }
       else {
           for (int i = 0; i < firstArray.length; i++) {
               resultArray[i] = firstArray[i];
           }
           for (int i = 0; i < secondArray.length; i++) {
               for (int j = 0; j < resultArray.length; j++) {
                   if (secondArray[i] <= resultArray[j]) {
                       for (int k = resultArray.length - 1; k > j; k = k - 1) {
                           resultArray[k] = resultArray[k - 1];
                       }
                       resultArray[j] = secondArray[i];
                       break;
                   }
               }
           }
           int k = secondArray.length - 1;
           int q = resultArray.length - 1;
           if (secondArray[k] > resultArray[q]) {

               while (secondArray[k] > resultArray[q]) {
                   resultArray[q] = secondArray[k];
                   k = k - 1;
                   q = q - 1;
                   if (k < 0 || q < 0) {
                       break;
                   }
               }
           }
       }
        return resultArray;
    }
*/

