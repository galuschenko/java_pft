package ua.qa.pft.testingweb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewLesson6 {
    public static void main(String[] args) {
        int numberForSearching = 4;
        int massiveOfNumbers1[] = {1, 2, 3};
        int massiveLength = 10000000;
        int [] massiveOfNumbers2 = new int [massiveLength];
        for (int i = 0; i < massiveOfNumbers2.length; i++) {
            massiveOfNumbers2[i] = (int)(Math.random() * massiveLength);
        }

        //System.out.println(creatingMass1(numberForSearching, massiveOfNumbers2));

        System.out.println(creatingMass2(numberForSearching, massiveOfNumbers2));

        //System.out.println(creatingMass1(numberForSearching, massiveOfNumbers1));

        //System.out.println(creatingMass2(numberForSearching, massiveOfNumbers1));
    }

    public static String creatingMass1(int numberForSearching, int[] massiveOfNumbers1) {


        System.out.println("Elements of massive are - " + Arrays.toString(massiveOfNumbers1));
        String index;
        int VerificationIndex = 0;
        List<Integer> listOfIndexes = new ArrayList<Integer>();
        for (int i = 0; i < massiveOfNumbers1.length; i++) {
            if (massiveOfNumbers1[i] == numberForSearching) {
                VerificationIndex++;
                listOfIndexes.add(i);
            }
        }
        if (listOfIndexes.isEmpty()) {
            index = "No same elements are found";
        } else {
            index = ("Same elements is/are found - " + listOfIndexes.toString());
               }
        return index;
    }
    public static String creatingMass2(int numberForSearching, int[] massiveOfNumbers) {
        Arrays.sort(massiveOfNumbers);
        int middleIndex = massiveOfNumbers.length/2;
        int verificationIndex = 0;
        String index;
        if (massiveOfNumbers[middleIndex] > numberForSearching) {
            for (int i = 0; i <= middleIndex; i++) {
                if (massiveOfNumbers[i] == numberForSearching) {
                    verificationIndex++;
                }
            }
        } else if (massiveOfNumbers[middleIndex] <= numberForSearching) {
            for (int i = middleIndex; i<massiveOfNumbers.length; i++) {
                if (massiveOfNumbers[i] == numberForSearching) {
                    verificationIndex++;
                }
            }
        }

        if (verificationIndex > 0){
            index = "Same element is found";
        } else {
            index = "No same elements are found";
        } return index;
    }
}

