import java.util.Scanner;

public class wuerfelSpiel {

    public static void main(String[] args) {


        int computerCube = 0;
        int userCube = 0;

        boolean isGameStarting = false;

        System.out.println("1.\t Start");
        System.out.println("2.\t Beenden");


        Scanner scanner = new Scanner(System.in);
        int ScannerInput = scanner.nextInt();

        if (ScannerInput == 1){

            isGameStarting = true;
            System.out.println("Input Is true");

        }






    }
}
