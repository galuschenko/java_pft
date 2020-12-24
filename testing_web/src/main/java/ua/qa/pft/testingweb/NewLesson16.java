package ua.qa.pft.testingweb;

import java.util.Arrays;

public class NewLesson16 {
    public static void main(String[] args) {
      String[] roles = {"sasha", "petja", "vasja"};
      String[] textLines = {"sasha: lsdfjsdhfsdfsdlkjhflksdhfsasha", "petja: osudfkhdksfdskjflsdhpetja", "vasja: sldhflksdlkhfdslkfhlsdkjvasja", "petja: dflsdkfh"};
        System.out.println(printTextPerRole(roles, textLines));
    }

    public static String printTextPerRole (String[] roles, String[] textLines) {
        String outputText = "";
        for (int i = 0; i< textLines.length; i++){
            for (int j = 0; j<roles.length; j++){
                StringBuilder buffer = new StringBuilder();
                StringBuilder buffer2 = new StringBuilder();
                int s = 0;
                while (textLines[i].toCharArray()[s] != ':') {
                    buffer.append(textLines[i].toCharArray()[s]);
                    s++;
                }

                s++;

                while (s < textLines[i].length()){
                    buffer2.append(textLines[i].toCharArray()[s]);
                    s++;
                }
                if (buffer.toString().equals(roles[j])){
                    System.out.println(roles[i]);

                }
            }
        }

      //  for (int i = 0; i<roles.length; i++){

           // outputText = outputText+roles[i] + "\n\n";
       // }
return outputText;
    }




}
