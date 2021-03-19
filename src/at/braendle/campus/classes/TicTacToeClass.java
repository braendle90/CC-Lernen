package at.braendle.campus.classes;

public class TicTacToeClass {


    public static boolean findSolution(char[][] field, char player) {

        if (field[0][0] == player && field[1][1] == player && field[2][2] == player) {

            return true;
        }
        if (field[2][0] == player && field[1][1] == player && field[0][2] == player) {


            return true;
        }
        if (field[0][0] == player && field[0][1] == player && field[0][2] == player) {

            return true;
        }
        if (field[1][0] == player && field[1][1] == player && field[1][2] == player) {

            return true;
        }
        if (field[2][0] == player && field[2][1] == player && field[2][2] == player) {

            return true;
        }
        //1 collum
        if (field[0][0] == player && field[1][0] == player && field[2][0] == player) {


            return true;
        }

        //2 collum
        if (field[0][1] == player && field[2][1] == player && field[1][1] == player) {


            return true;
        }
        //3 collum
        if (field[0][2] == player && field[1][2] == player && field[2][2] == player) {


            return true;
        }

        return false;
    }

    public static char [][] fillArrayForGame (){

        char[][] field = new char[3][3];

        for (int d = 0; d < 3; d++) {
            for (int s = 0; s < 3; s++) {
                field[d][s] = ' ';




            }

        }


        return field;


    }


}