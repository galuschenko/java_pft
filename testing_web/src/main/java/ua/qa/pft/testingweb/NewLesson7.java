package ua.qa.pft.testingweb;

public class NewLesson7 {
    public static void main(String[] args) {
        // Для отрезка пополам надо сделать 2 условия где i < 5000 и где i = 5000...10000

        for (int i = 0; i<10000; i++){
            double x = (double) i / 1000;
            int a = (int) Math.round(Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - (345.3 * x));
        //     System.out.println(i/1000 + ": " + x + " " + a);
            if (a == 23) {
                System.out.println("x = " + x );
            }
        }
//        if (x == 0.0) {
//            System.out.println("x isn't found");
//        }
//        else {
//            System.out.println("x = " + x);
//        }
    }
}
