import java.util.Scanner;

public class KilometroMetro {
    public static void main (String [] args){
        double kph, mps;
        Scanner sr=new Scanner(System.in);
        System.out.println("Escribe los kilometros por hora");
        kph=sr.nextDouble();
        mps= kph*1000/3600;
        System.out.println(kph+ " kilometros por hora son "+mps+" metros por segundo");
    }

}
