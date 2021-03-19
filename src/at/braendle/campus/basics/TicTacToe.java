package at.braendle.campus.basics;

import java.util.Scanner;

import at.braendle.campus.classes.TicTacToeClass;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] field = new char[3][3];

        //Scanner scan = new Scanner(System.in);
        //String scaninput = scan.next();
        //String[] input = scaninput.split(",");

        //int x = Integer.parseInt(input[0]);
        //int y = Integer.parseInt(input[1]);

        int ablauf = 0;


        char player1 = 'X';
        char player2 = '0';
        char player = ' ';


        field = TicTacToeClass.fillArrayForGame();


        while (true) {
            if ((ablauf % 2) == 0) {
                System.out.println("Player One ist dran.");

                player = 'X';


            }
            if ((ablauf % 2) > 0) {
                System.out.println("Player Two ist dran.");

                player = '0';


            }
            outputResult(field);


            int[] result = xyreturn();

            if (findIfCharIsChosen(field, player, result)) continue;

            ablauf++;


            field[result[0]][result[1]] = player;


            if (TicTacToeClass.findSolution(field, player) == true) {
                outputResult(field);
                System.out.println("Player " + player + " hat gewonnen.\nVerlierer fängt an");
                field = TicTacToeClass.fillArrayForGame();
                continue;
            }


        }


    }

    private static boolean findIfCharIsChosen(char[][] field, char player, int[] result) {
        if (player == '0' && field[result[0]][result[1]] == 'X') {
            System.out.println("Spieler ist two(0) im Feld ist aber schon ein 'X");
            return true;

        }
        if (player == 'X' && field[result[0]][result[1]] == '0') {
            System.out.println("Spieler ist one(X) im Feld ist aber schon ein '0");
            return true;

        }
        if (player == '0' && field[result[0]][result[1]] == '0') {
            System.out.println("Spieler ist two(0) im Feld ist aber schon ein '0");
            return true;

        }
        if (player == 'X' && field[result[0]][result[1]] == 'X') {
            System.out.println("Spieler ist one(X) im Feld ist aber schon ein 'X");
            return true;

        }
        return false;
    }

    private static void outputResult(char[][] field) {
        for (int i = 0; i < 3; i++) {
            System.out.print("|");

            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j]);
                System.out.print("|");

            }
            System.out.println("");

        }
    }


    public static int[] xyreturn() {


        Scanner scan = new Scanner(System.in);
        String scaninput = scan.next();
        String[] input = scaninput.split(",");

        int[] xAndY = new int[2];
        xAndY[0] = Integer.parseInt(input[0]);
        xAndY[1] = Integer.parseInt(input[1]);

        return xAndY;


    }


}
