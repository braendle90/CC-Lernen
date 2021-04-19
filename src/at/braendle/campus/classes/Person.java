package at.braendle.campus.classes;


public class Person {


    String drivelers = "Ja er hatt eine Fahrerlaubnis";
    private int age;
    private String name;
    double weight;

    public Person() {

    }

    public void makeFoto(){

        System.out.println("KLICK ");


    }

    public static void machFoto(){

        System.out.println("KLICK STATIC");

    }


    public void ageTwoTimes() {


        this.age = age*2;
    }

    public String walk(){

        return name+ " sauft!";

    }
    public Person(String name){
        this.name = name;

    }

    public Person(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("drivelers='").append(drivelers).append('\'');
        sb.append(", age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    public String getDrivelers() {
        return drivelers;
    }

    public void setDrivelers(String drivelers) {
        this.drivelers = drivelers;
    }

    public String getAgeAndName() {
        return "Age: "+age+" Name: "+name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}




