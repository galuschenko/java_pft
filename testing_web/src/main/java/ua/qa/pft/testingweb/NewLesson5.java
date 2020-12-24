package ua.qa.pft.testingweb;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class NewLesson5 {

    public static void main(String[] args) {
        GenNumsWhithPribability pribabilityGen = new GenNumsWhithPribability(new int[]{1,2,3},new int[]{1,2,10});
        IntStream.generate(pribabilityGen::getNextVal).limit(33).forEach(System.out::println);
    }
}
class GenNumsWhithPribability {
    private static Random random = new Random();
    private int[] vals;
    private int[] probabilVals;
    private int rangUnit;

    GenNumsWhithPribability(int[] vals, int[] probabilVals) {
        this.vals = vals;
        this.probabilVals = probabilVals;
        this.rangUnit = getRangUnit();
    }

    private int getRangUnit(){
        return Integer.MAX_VALUE / Arrays.stream(probabilVals).max().getAsInt();
    }

    int getNextVal() {
        int rndNu = Math.abs(GenNumsWhithPribability.random.nextInt());
        for (int i = 0; i < probabilVals.length; i++) {
            if (rndNu <= rangUnit * probabilVals[i]) return vals[i];
        }
        return -1;
    }
}