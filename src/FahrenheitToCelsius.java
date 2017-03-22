import java.util.Scanner;

/**
 * Created by Sara on 22/03/2017.
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {

       float temperature;
        Scanner in=new Scanner(System.in);

        System.out.println("Introduceti o valoare:");
        temperature=in.nextInt();

        temperature=((temperature-32)*5)/9;
        System.out.println("Transformare in grade Celsius:"+temperature);



    }




}
