/**
 * Created by Sara on 18/03/2017.
 */
public class Exercitii2 {
    public static void main(String[] args) {

        int numar;
        numar=SkeletonJava.readIntConsole("Introduceti un numar:");

        for(int i=1; i<=10; i++) {
            System.out.println(i+"X"+numar+"="+i * numar);
        }

    }
}
