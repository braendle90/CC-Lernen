package at.braendle.campus.classes;

import java.util.Random;

public class findWordClass {
        // find a random Number for the selection of the word in a list array
    public static int generate(int min,int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }




    // method for find letters in index and replace the var "result" with the keyboard input letter that are in the same index of the chosen word.
    public static String getLetter(String chosenWord, String result, char input, String s) {
        for (int i = 0; i < chosenWord.length(); i++) {

            for (int j = 0; j < chosenWord.length(); j++) {
                String find = Character.toString(chosenWord.charAt(i));
                if (find.equalsIgnoreCase(s)) {

                    result = result.substring(0, i) + input + result.substring(i + 1);

                }

            }

        }
        return result;
    }


}
