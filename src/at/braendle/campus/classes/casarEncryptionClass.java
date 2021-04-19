
package at.braendle.campus.classes;

import java.util.Random;
import java.util.Scanner;

public class casarEncryptionClass {


    public static int getsRandom() {

        Random ran = new Random();
        int nxt = ran.nextInt(80 - 30) + 10;


        return nxt;


    }




    public static void souten() {
        System.out.println("Bitte geben Sie ein Word oder Satz ein.");

    }


}
