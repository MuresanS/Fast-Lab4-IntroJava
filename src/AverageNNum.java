import java.util.Scanner;

/**
 * Created by Sara on 24/03/2017.
 */
public class AverageNNum {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double a;
        double suma=0;
        int calcul=0;

        do {
            System.out.println("Introduce-ti numere: ");
            a=input.nextDouble();
            suma=suma+a;
            calcul++;
        }

        while (a!=0);
        System.out.println("Suma este "+suma+" care v-a fii impatita la "+(calcul-1));
        System.out.println("Media numerelore este "+suma/(calcul-1));

    }
 }
