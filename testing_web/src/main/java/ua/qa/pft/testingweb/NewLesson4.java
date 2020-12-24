package ua.qa.pft.testingweb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewLesson4 {
    public static void main(String[] args) {
        int numberForRemove = 23;
        int[]nubersArray = {1,23, 20, 48, 23, 94, 22, 23,0, 1000,23};
        String a = Arrays.toString(nubersArray);

        System.out.println("=====================================\nAnother integer - " + numberForRemove);
        System.out.println("=====================================\nMassive before changing - " + a + "\n=====================================");

        List<Integer> numbersList = new ArrayList<Integer>();
        for (int i = 0; i<nubersArray.length; i++) {
            int b = nubersArray[i];
            if (b != numberForRemove) {
                numbersList.add(nubersArray[i]);
            }
        }
        System.out.println("=====================================\nData after changing\n=====================================");
        for (int c : numbersList) {
            System.out.print(c + ", ");
        }
        System.out.println("\n=====================================");
    }
}
