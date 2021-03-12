import java.util.Random;
import java.util.Scanner;

public class MethodLessonPrimnumber {

    public static void main(String[] args) {


        int startNumber = 100;
        int endNumber = 500;

        Scanner scann = new Scanner(System.in);

        //int primScanner = scann.nextInt();


        //PrimNumberCalc(primScanner);

        //divider(primScanner, 3);

        //findnumbersbetween(3,10);

        System.out.println(randomNumber(startNumber,endNumber));;


    }


    public static boolean divider(int primNumber, int divider) {

        boolean isdivider = false;


        if ((primNumber % divider) == 0) {
            System.out.println("Ist durch " + divider + " Teilbar");

        }
        if ((primNumber % divider) != 0) {
            System.out.println("Ist NICHT durch " + divider + " Teilbar");

        }
        return isdivider;


    }

    public static boolean PrimNumberCalc(int primNumber) {

        boolean isPrimNumber = true;
        double divider = 2;
        double dividersum;

        while (isPrimNumber) {


            dividersum = primNumber % divider;


            if (dividersum == 0) {

                isPrimNumber = false;
                System.out.println("Ist Teilbar\nKeine Primzahl.");
            }

            if ((divider * divider) > primNumber) {

                isPrimNumber = false;

                System.out.println("Ist nicht Teilbar\nPrimzahl.");
            }

            divider = divider + 1;


        }
        return isPrimNumber;


    }

    public static void findnumbersbetween(int firstNumber, int secondNumber) {

        String outputNumbersBetween = "";




        for (int i = firstNumber; i <= secondNumber; i++) {
            outputNumbersBetween = outputNumbersBetween + i;

        }

        System.out.println(outputNumbersBetween);
    }

    public static int randomNumber(int startNumber,int endNumber){

        Random random = new Random();

        int randomBetween = random.nextInt(endNumber - startNumber + 1) + startNumber;

        return randomBetween;


    }



}
