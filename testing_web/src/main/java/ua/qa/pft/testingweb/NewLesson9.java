package ua.qa.pft.testingweb;

import org.openqa.selenium.json.JsonOutput;

public class NewLesson9 {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(isPowerOfTwo(a));
        System.out.println("A" + ('\t' + '1'));
        System.out.println(isPalindrome("Myadam, I'm Adam!"));
    }
    public static boolean isPowerOfTwo(int value) {
        boolean b;
        b = ((Math.abs(value) & (Math.abs(value) - 1)) == 0 && value !=0);
        return b;  // you implementation here
    }
    public static boolean isPalindrome(String text) {
        String text2 = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String text2Invert = new StringBuilder(text2).reverse().toString();
        return (text2.equals(text2Invert)); // your implementation here
    }
}

