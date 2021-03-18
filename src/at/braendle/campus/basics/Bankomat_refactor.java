package at.braendle.campus.basics;
import  at.braendle.campus.classes.BankomatRefactorClass;



import java.util.Scanner;

public class Bankomat_refactor {








    public static void main(String[] args) {


        int graduation = 0;

        String test = "";
        int valueOfScannerInput = 0;


        BankomatRefactorClass.printMenu();


        while (valueOfScannerInput != 4) {


            valueOfScannerInput = BankomatRefactorClass.inputScanner.nextInt();


            switch (valueOfScannerInput) {

                case 1:
                    BankomatRefactorClass.DepositToAccoutn();


                    break;

                case 2:

                    BankomatRefactorClass.withdrawMoney();

                    break;

                case 3:
                    outputbankBalance();

                    break;
                case 4:
                    System.out.println("Rechner beenden!");
                    break;
                default:
                    System.out.println("Bitte geben Sie eine gültige Zahl zwischen 1 - 4 ein.");
                    break;

            }

        }


    }


    public static void outputbankBalance() {

        System.out.println("Ihr Kontostand ist: " + (int) BankomatRefactorClass.bankBalance);


    }


}



