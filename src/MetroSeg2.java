import java.util.Scanner;

public class MetroSeg2 {
    public static void main(String[] args) {
        double kph, mps;
        Scanner sr=new Scanner(System.in);
        System.out.println("Escribe los kilometros por hora");
        kph=sr.nextDouble();
        MetroSegundo(kph);
    }
    public static void MetroSegundo (double kh){
        double ms;
        ms=kh*1000/3600;
        System.out.println("El resultado son "+ms+" m/s");
    }
}
