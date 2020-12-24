package ua.qa.pft.testingweb;

public class NewLesson2 {
    public static void main(String[] args) {

        int a = 0;
        int b = 100;
        System.out.println("Numbers:\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = a; i<b; i=i+2) {
            if (i%2 == 0 && i%7 == 0) {
                System.out.println(i);
                a = a+i;
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Summ of numbers:  " + a);
    }
}
// todo
// реализовать функцию, которая будет искать простые числа в заданном диапазоне от а до б
