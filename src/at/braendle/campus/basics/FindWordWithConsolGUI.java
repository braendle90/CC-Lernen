package at.braendle.campus.basics;

import at.braendle.campus.classes.FindWordsWithConsolGUIClass;
import at.braendle.campus.classes.findWordClass;

import java.util.Scanner;

public class FindWordWithConsolGUI {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String allWords = "ja, wurde, jetzt, immer, seinen, wohl, dieses, ihren, würde, diesen,sondern, weil, welcher, nichts, diesem, alles, waren, will, Herr, viel, mein, also, soll, worden, lassen, dies, machen, ihrer, weiter, Leben, recht, etwas, keine, seinem, ob, dir, allen, großen, Jahre, Weise, müssen, welches, wäre, erst, einmal, Mann, hätte, zwei, dich, allein, Herren, während, Paragraph, anders, Liebe, kein, damit, gar, Hand, Herrn, euch, sollte, konnte, ersten, deren, zwischen, wollen, denen, dessen, sagen, bin, Menschen, gut, darauf, wurden, weiß, gewesen, Seite, bald, weit, große, solche, hatten, eben, andern, beiden, macht, sehen, ganze, anderen, lange, wer, ihrem, zwar, gemacht, dort, kommen, Welt, heute, Frau, werde, derselben, ganzen, deutschen, lässt, vielleicht, meiner";
        String[] choosenWordArray = allWords.split(", ");
        // get the random number from Method.
        int randomcalc = findWordClass.generate(0, choosenWordArray.length);
        String chosenWord = choosenWordArray[randomcalc];
        String result = chosenWord.replaceAll(".", "*");

        int numbersOfTries = 0;
        String ResultBefor;
        String wrongWords = "";
        String rightWords = "";


        System.out.println("Das zu erratene Word ist: " + chosenWord);

        //check if wanted word is equal to the chosen word.
        while (!chosenWord.equalsIgnoreCase(result)) {





            char input = scan.next().charAt(0);
            String s = String.valueOf(input);

            ResultBefor = result;


            // result Calculatet from method chosenWord = chosen from the List ,Result = with "*" or letter from input, and s = input from keyboard
            result = findWordClass.getLetter(chosenWord, result, input, s);
            System.out.println(result);




            if (rightWords.contains(Character.toString(input))) {
                System.out.println("Buchstabe schon vorhanden.");
                continue;

            }
            rightWords = rightWords + input;

            if (ResultBefor.equalsIgnoreCase(result)) {

                //System.out.println("Das Wort hat sich gerändert also wurde der buchstabe richtig eingegeben.");
                //



               wrongWords = wrongWords + input;

                System.out.println(wrongWords);

                numbersOfTries++;


            }


            // if input letters are equal to the wanted words and if true while loop is break. and the result is given out.
            if (result.equalsIgnoreCase(chosenWord)) {
                System.out.println("Das erratene Word ist: " + result);

                break;
            }

            FindWordsWithConsolGUIClass.gameBoard(numbersOfTries);

            if (numbersOfTries == 7) {
                System.out.println("Sie haben verlohren.");
                System.out.println("Das erratene Word ist: " + chosenWord);

                break;
            }



        }


    }


}
