package ua.qa.pft.testingweb;

public class ifesleLesson {

    public static void main(String[] args) {
        int[] numbersArray = new int[]{1, 5, 1};

        if (numbersArray[0] > numbersArray[1]) {
          int  buff = numbersArray[1];
           numbersArray[1] = numbersArray[0];
           numbersArray[0] = buff;
        }
        if (numbersArray[1] > numbersArray[2]) {
           int buff2 = numbersArray[2];
            numbersArray[2] = numbersArray[1];
            numbersArray[1] = buff2;
        }
        if (numbersArray[0] > numbersArray[2]) {
            int buff3 = numbersArray[2];
            numbersArray[2] = numbersArray[0];
            numbersArray[0] = buff3;
        }
        if (numbersArray[0] > numbersArray[1]) {
            int buff = numbersArray[1];
            numbersArray[1] = numbersArray[0];
            numbersArray[0] = buff;
        }
        System.out.println(numbersArray[0] + " " + numbersArray[1] + " " + numbersArray[2]);
    }


}
