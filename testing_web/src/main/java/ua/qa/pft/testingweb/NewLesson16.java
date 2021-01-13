package ua.qa.pft.testingweb;

import java.util.Arrays;

public class NewLesson16 {
    public static void main(String[] args) {

        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
      //String[] roles = {"sasha", "petja", "vasja"};
     // String[] textLines = {"sasha: lsdfjsdhfsdfsdlkjhflksdhfsasha", "petja: osudfkhdksfdskjflsdhpetja", "vasja: sldhflksdlkhfdslkfhlsdkjvasja", "petja: dflsdkfh"};
        System.out.println(printTextPerRole(roles, textLines));
    }

    public static String printTextPerRole (String[] roles, String[] textLines){

        String[] roleFromText = new String[textLines.length];
        String[] textFromText = new String[textLines.length];
        for (int i=0; i< textLines.length; i++){
            String[] buffer = textLines[i].split(": ", 2);
            roleFromText[i] = buffer[0];
            textFromText[i] = buffer[1];

        }

      /*  String[] rolesAndText = new String[roles.length];
        for (int i = 0; i < roles.length; i++){
           rolesAndText[i] = roles[i] + ": ";
            for (int j = 0; j < roleFromText.length; j++){
                if (roles[i].equals(roleFromText[j])){
                    rolesAndText[i] = rolesAndText[i] + "\n" + (j+1) + ") " + textFromText[j];
                }
            }
        }
        StringBuilder outputText = new StringBuilder();
        for (int i = 0; i< rolesAndText.length; i++){
            outputText.append(rolesAndText[i]).append("\n\n");
        }
*/

        StringBuilder outputText = new StringBuilder();
        for (int i=0; i<roles.length; i++){
            outputText.append(roles[i]).append(":").append('\n');
            for (int j = 0; j< roleFromText.length; j++){
                if (roles[i].equals(roleFromText[j])){
                    outputText.append(j+1).append(") ").append(textFromText[j]).append('\n');
                }
            }
            if (i< roles.length-1) {
                outputText.append('\n');
            }
        }

return outputText.toString();
    }



}
