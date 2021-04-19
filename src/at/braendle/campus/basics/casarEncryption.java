package at.braendle.campus.basics;

import at.braendle.campus.classes.casarEncryptionClass;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class casarEncryption {
    static {casarEncryptionClass.souten();}

    static Scanner scanner1 = new Scanner(System.in);

    static String scannerName = scanner1.nextLine();
    public static String[] encryption = new String[scannerName.length()];

    public static void main(String[] args) {




        char[] splitName = new char[scannerName.length()];




        splitName = scannerName.toCharArray();

        char[] encryptionString = new char[scannerName.length()];

        for (int i = 0; i <= scannerName.length() - 1; i++) {

            encryption[i] = "";

            int x = +casarEncryptionClass.getsRandom();




            // random Number

            //System.out.println("Random: " + x);



            encryption[i] = encryption[i] + (x);



            int d = (int) splitName[i] + x;






            if (d > 127) {

                d = (int) splitName[i] - x;

                //System.out.println("Negativ"+ -x);
                encryption[i] =   Integer.toString(-x);

            }

            // System.out.println("Char of index in number: " + (int) splitName[i]);
            // System.out.println("First Char plus Random Number: " + d);
            // System.out.println("");

            encryptionString[i] = (char) d;


        }


        String str = new String(encryptionString);
        System.out.println("Encription String:" + str);
        System.out.println("Schlüssel zum berrechnen: " + Arrays.toString(encryption));

        System.out.println("__________DECODING___________");


        System.out.println("Entschüsseltes Word:" + decoding(encryption, str));

    }

    public static String decoding(String[] encryption, String str) {

        String wordDecoded = "";
        int decoding = 0;
        int decodingName = 0;

        for (int i = 0; i < encryption.length; i++) {


            decoding = Integer.parseInt(encryption[i]);
            decodingName = str.charAt(i);
            int numberCalulatet = decodingName - decoding;


            //System.out.println();

            //System.out.println("Name Buchstabe in Zahl: " + decodingName);
            //System.out.println("Cäserverschlüsselung Zahl: " + decoding);

            //System.out.println("Beide Zahlen zusammen gerechnet: "+numberCalulatet);

            // ist größer als 127

            if (decoding < 0) {





                char b = (char) (decodingName + -decoding);




                wordDecoded += b;
                //System.out.println("check higher than 127: " + b);


            } else if (decoding > 0) {
              //  System.out.println("DecodingName Not HIger: " + decodingName);
              //  System.out.println("Decoding  RAndom NOT higher: " + decoding);
              //  System.out.println("Ausgabe: " + (decodingName - decoding));


                char b = (char) (decodingName - decoding);

                wordDecoded += b;
               // System.out.println("chekc not HIgher:" + b);


            }


        }


        return wordDecoded;

    }



}
