package at.braendle.campus.basics;

import java.util.Scanner;

public class LessonNadin {


    public static void main(String[] args) {

        int sum = 0;
        int sumzw = 0;

        Scanner scanerInput = new Scanner(System.in);

        int quersummeInput = scanerInput.nextInt();

        String quersummeString = Integer.toString(quersummeInput);


        for (int i = 0; i < quersummeString.length() ; i++) {


                sum = sum + Integer.parseInt(quersummeString.substring(i,i+1));

                //System.out.println(sum);

        }


        String sumzwString = Integer.toString(sum);

        for (int j = 0; j < sumzwString.length() ; j++) {





            sumzw = sumzw + Integer.parseInt(sumzwString.substring(j,j+1));

            //System.out.println(sum);

        }
        System.out.println("zw("+sum+")="+sumzw);


    }
}
