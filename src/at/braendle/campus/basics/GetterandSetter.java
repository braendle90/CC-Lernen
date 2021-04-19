package at.braendle.campus.basics;

import at.braendle.campus.classes.Person;

public class GetterandSetter {

    public static void main(String[] args) {

         Person person = new Person(18,"Dominik",79.90);


        System.out.println(person.getName()+" "+person.getAge());

        System.out.println(person.toString());

        System.out.println(person.getAgeAndName());


        person.makeFoto();
        System.out.println("_____-----__");


        Person.machFoto();

    }



}