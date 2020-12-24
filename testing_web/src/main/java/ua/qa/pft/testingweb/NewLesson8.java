package ua.qa.pft.testingweb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewLesson8 {
    public static void main(String[] args) {
        /*Ввод данных словаря**/
    String a = "This method converts string to character array. The char array size is same as the length of the string";
        /*Магия*/
    List<Character> letters = new ArrayList<Character>();
    List<Integer> lettersRating = new ArrayList<Integer>();
    char[] dictionary = a.toCharArray();
        /*Вывод словаря на экран*/
        System.out.println("***********************************\nDictionary contains: \n" + a);
        //System.out.print("Dictionary converted to char: \n");
        /*Магия*/
        for (char c : dictionary) {
            if (!letters.contains(c)) {
                letters.add(c);
            }
        }
           List<Character> sortedLetters = letters.stream().sorted().collect(Collectors.toList());
        /*Вывод уникальных символов*/
            System.out.println("Unsorted unique symbols from dictionary");
            for (char l : letters) {
                System.out.print(l);
            }
        /*Вывод отсортированных уникальных символов*/
            System.out.println("\nSorted unique symbols from dictionary");
            for (char l : sortedLetters) {
                System.out.print(l);
            }
        //System.out.println("***********************************");
           for (int i=0; i<sortedLetters.size(); i++) {
               int counter = 0;
                for (int j=i; j<dictionary.length; j++) {
                    if (sortedLetters.get(i) == dictionary[j]) {
                    counter++;
                    }
                }
               lettersRating.add(counter);
            }
           /*Вывод счетчика символов*/
        System.out.println("\n***********************************\nCounts of symbols from dictionary");
           for (int i = 0; i<sortedLetters.size(); i++) {
               System.out.println(sortedLetters.get(i) + " count is: " + lettersRating.get(i));
        }
        System.out.println("***********************************");
        }



    }

