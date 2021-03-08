public class QuersummeLessonVielfaches{

        public static void main(String[] args) {

            int quersummeLenght = 20;
            int sum = 0;
            int num = 0;
            int querSumme = 0;

            //Berechnung von 1 bis Zahlen 1000
            for (int j = 1; j < 1000; j++) {


                String s = Integer.toString(j);

                int[] intArray = new int[s.length()];

                sum = 0;
                querSumme = 0;

                System.out.println("Berechnete Zahl ist : "+j);


                //Quersumme berechnenCharacter.getNumericValue(s.charAt(i));

                for (int i = 0; i < s.length(); i++) {
                   // System.out.println("Anzahl Zahlen: " + s.length());
                    intArray[i] = Character.getNumericValue(s.charAt(i));

                    sum = sum + intArray[i];
                    //System.out.println((i+1)+".Zahl "+intArray[i]);
                }

                System.out.println("Ausgabe Quersumme "+ sum);

                if ((sum % 7) == 0) {
                    System.out.println("SUMME IST DURCH SIEBEN TEILBAR");
                    
                }




            }


        }
}
