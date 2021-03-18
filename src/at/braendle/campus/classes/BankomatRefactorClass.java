package at.braendle.campus.classes;

import at.braendle.campus.basics.Bankomat_refactor;

import java.util.Scanner;

public class BankomatRefactorClass {

    public static String moneyWithdraw = "";
    public static double moneyDeposit = 0;
    public static Scanner inputScanner = new Scanner(System.in);
    public static Scanner stringScanner = new Scanner(System.in);
    public static int graduation = 0;
    public static int intmoneyWithdraw = 0;
    public static double bankBalance = 1000;






    public static void printMenu(){

        System.out.println("Selektieren Sie die gewünschte Funtkion;");
        System.out.print("\t 1. Einzahlen\n");
        System.out.print("\t 2. Abheben\n");
        System.out.print("\t 3. Kontostand\n");
        System.out.print("\t 4. Ende\n");

    }


    public static void DepositToAccoutn(){
        System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten: ");

        moneyDeposit = inputScanner.nextDouble();

        if (moneyDeposit < 0) {
            System.out.println("Bitte geben Sie eien Gültige Zahl ein");
            moneyDeposit = 0;
            moneyDeposit = (int) inputScanner.nextDouble();
        }

        System.out.println("Sie haben " + (int) moneyDeposit + " eingezahlt!");
        bankBalance = bankBalance + moneyDeposit;

    }

    public static void withdrawMoney() {

        System.out.println("Wie viel würden Sie gerne Abheben?");
        System.out.println("Für Stückelung geben Sie Bitte ' Z ' ein ");
        System.out.println("\t1.\t10€\t\t2. 20€\n\t3.\t50€\t\t4. 100€\n\t5.\t200€\t6. 500€\n");

        moneyWithdraw = stringScanner.nextLine();


        //System.out.println(intmoneyWithdraw);

        if (moneyWithdraw.toLowerCase().equals("z")) {

            System.out.println("Bitte geben Sie jetzt die Stückelung ein.");

            graduation = inputScanner.nextInt();


            int[] digits = Integer.toString(graduation).chars().map(c -> c - '0').toArray();


            //System.out.println("erste Zahl: "+digits[0]+"zweite Zahl"+ digits[1]);
            //System.out.println("Länge von DIGITS: " + digits.length);


            for (int i = 0; i < digits.length; i++) {


                switch ((int) digits[i]) {

                    case 1:
                        //System.out.println("EINS");
                        intmoneyWithdraw = intmoneyWithdraw + 10;


                        break;

                    case 2:
                        //System.out.println("ZWEI");
                        intmoneyWithdraw = intmoneyWithdraw + 20;
                        //System.out.println("Bank Guthaben: " + bankBalance);
                        break;
                    case 3:
                        //System.out.println("DREI");
                        intmoneyWithdraw = intmoneyWithdraw + 50;
                        break;
                    case 4:
                        //System.out.println("Vier");
                        intmoneyWithdraw = intmoneyWithdraw + 100;
                        break;
                    case 5:
                        //System.out.println("FÜNF");
                        intmoneyWithdraw = intmoneyWithdraw + 200;
                        break;
                    case 6:
                        //System.out.println("SECHS");
                        intmoneyWithdraw = intmoneyWithdraw + 500;
                        break;


                }

            }


        } else {
            intmoneyWithdraw = Integer.parseInt(moneyWithdraw);
        }


        if (intmoneyWithdraw < 0) {
            System.out.println("Bitte geben Sie eien Gültige Zahl ein");
            intmoneyWithdraw = 0;
            intmoneyWithdraw = (int) inputScanner.nextDouble();
        }

        if (intmoneyWithdraw <= bankBalance) {

            System.out.println("Sie bekommen: " + intmoneyWithdraw + "€");
            bankBalance = bankBalance - intmoneyWithdraw;
            intmoneyWithdraw = 0;
        }

        if (intmoneyWithdraw > bankBalance) {
            System.out.println("Sie habne nicht genügen Guthaben!");
        }
    }

}
