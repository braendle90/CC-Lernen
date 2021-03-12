public class MethodLessonNameAndFamale {

    public static void main(String[] args) {


        String firstName = "Dominik";
        String secondName = "Braendle";
        boolean isMale = true;

        salutationMaleOrFamale(firstName,secondName,isMale);


    }

    public static void salutationMaleOrFamale(String firstName, String secondName, boolean isMale) {

        String fullName = firstName + " " + secondName;

        if (isMale == true) {
            System.out.println("Sehr geehrter Herr " + fullName);

        }
        if (isMale == false) {
            System.out.println("Sehr geehrte Frau " + fullName);

        }




    }
}
