package at.braendle.campus.basics;

import java.util.Locale;

public class MethodLessonCalculaton {

    public static void main(String[] args) {

        char[] c = {'x','y','s'};
        String s = String.valueOf(c);
        double firstPara = 123.3;
        double secondPara = 100.0;

        //double res = sub(firstPara, secondPara);
        //double res = add(firstPara,secondPara);
        //double res = multiply(firstPara,secondPara);
        double res = divison(firstPara,secondPara);
        System.out.println(s.charAt(1));


    }


    public static double sub(double firstPara, double secondPara) {

        return firstPara - secondPara;

    }


    public static double add(double firstPara, double secondPara) {

        return firstPara+ secondPara;

    }

    public static double multiply(double firstPara,double secondPara){

        return firstPara * secondPara;

    }

    public static double divison(double firstPara,double secondPara){

        return firstPara / secondPara;

    }


}
