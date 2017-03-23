/**
 * Created by Sara on 23/03/2017.
 */
public class BigNum {
    public static void main(String[] args) {
        int numar;
        int numar2;
        numar=SkeletonJava.readIntConsole("Introduceti un numar:");
        numar2=SkeletonJava.readIntConsole("Introduceti un alt numar:");

        if(numar<numar2){
            SkeletonJava.printConsole(numar2+" este mai mare.");
        }

        else{
            SkeletonJava.printConsole(numar+" este mai mare.");
        }

    }
}

// nu uita sa dai - Commit Push