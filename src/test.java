public class test {


    public static void main(String[] args) {

        String xOutput = "X";
        String _output = " ";


        String output = "X";


        //int[] d = {1, 2, 3, 4, 4, 3, 2, 1};
        String[] d = {"  ", " ", "  ", "   "};
        //int j = 0;
        boolean stopSwitch = true;


        for (int i = 0; i < 1; i++) {

            //System.out.print(xOutput);


            for (int j = 0; j < 4; j++) {

                output = "X" + d[j] + xOutput;

                System.out.println(output);
            }

            for (int j = 3; j >= 0; j--) {

                output = "X" + d[j] + xOutput;

                System.out.println(output);
            }

            System.out.println();


        }


    }
}
