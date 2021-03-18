package at.braendle.campus.basics;

import java.util.Scanner;

public class IFLEsson {

    public static void main(String[] args) {

        String testScanner = "";
        Scanner scanner = new Scanner(System.in);


        testScanner = scanner.nextLine();

        System.out.println(testScanner);

        if(testScanner.toLowerCase().equals("z")) {

            System.out.println("danke");
        }



    }
}
