/**
 * Created by Sara on 23/03/2017.
 */
public class Fahreheit2 {
    public static void main(String[] args) {

        int a;
        a=SkeletonJava.readIntConsole("Grade Celsius:");

        final float F=1.8f;
        double b=((a*F)+32);
        System.out.println("Transformare in grade Fahrenheit:"+b);
    }

}

// Transformare din Fahrenheit in Celsius.