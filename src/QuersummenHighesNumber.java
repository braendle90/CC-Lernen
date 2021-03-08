public class QuersummenHighesNumber {

    public static void main(String[] args) {

        int sumHighestQuersum = 0;
        int sum = 0;
        int quersumme = 0;
        int startNumber = 1;
        int endNumber = 1000;


        int[][] testArray = new int[endNumber][endNumber];

        for (int x = startNumber; x < endNumber; x++) {
            testArray[x][0] = x;

        }




        for (int i = startNumber; i <= endNumber; i++) {

            String stringArrayNumbers = Integer.toString(i);


            int[] intArrayNumbers = new int[stringArrayNumbers.length()];


            sum = 0;

            for (int j = 0; j < stringArrayNumbers.length(); j++) {

                intArrayNumbers[j] = Character.getNumericValue(stringArrayNumbers.charAt(j));


                sum = sum + intArrayNumbers[j];

            }

            for (int k = startNumber; k < endNumber; k++) {

                if (sum == testArray[k][0]) {

                    testArray[k][1] = testArray[k][1] +1;



                }

            }

            for (int z = startNumber; z < endNumber; z++) {

                if (testArray[z][1] > sumHighestQuersum ){

                    sumHighestQuersum =  testArray[z][1];
                    quersumme = testArray[z][0];

                }

            }



           /* if (sumHighestQuersum < sum ) {

                sumHighestQuersum = sum;


            }*/

            System.out.println(sum);

        }

        System.out.println("Aktuell höcshte Quersumme ist: " + quersumme+" Mit "+sumHighestQuersum+" Wiederholungen");
        System.out.println("TeST ARRAY: "+testArray[2][1]);
    }
}
