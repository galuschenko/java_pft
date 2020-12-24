package ua.qa.pft.testingweb;

public class CycleLesson<www, qqq> {
    public static void main(String[] args) {

        int a = 100000;
        int[] numArr = new int[a];
        randomaizer(a, numArr);
        organizer(a, numArr);
        anserer(a, numArr);
    }

    private static void anserer(int a, int[] numArr) {
        for (int i = 0; i < (a -1); i++) {
            System.out.print(numArr[i] + " ");
        }
    }

    private static void organizer(int a, int[] numArr) {
        int fromFirst = 0;
        int fromLast = (numArr.length - 1);
        do {
            for (int i = 0; i < (a -1); i++) {

                if (numArr[i] > numArr[i + 1]) {
                    int buffer = numArr[i + 1];
                    numArr[i + 1] = numArr[i];
                    numArr[i] = buffer;
                    fromFirst = 0;
                } else {
                    fromFirst++;
                }
            }
            for (int i = (a - 1); i != 0; i--) {
                if (numArr[i - 1] > numArr[i]) {
                    int buffer = numArr[i - 1];
                    numArr[i - 1] = numArr[i];
                    numArr[i] = buffer;
                    fromLast = (numArr.length - 1);
                } else {
                    --fromLast;
                }
            }
        }
        while (fromLast > fromFirst);
    }

    private static void randomaizer(int a, int[] numArr) {
        for (int i = 0; i < (a -1); i++) {
            double c = Math.random() * 100;
            numArr[i] = (int) c;
            System.out.print(numArr[i] + " ");
        }
        System.out.println("Now sorted");
    }

}