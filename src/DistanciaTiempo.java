import java.util.Scanner;

public class DistanciaTiempo {
    public static void main (String [] args){
        double distancia, tiempo, kmh;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introduzca la distancia recorrida");
        distancia=sr.nextDouble();
        System.out.println("Introduzca el tiempo que ha tardado");
        tiempo=sr.nextDouble();
        kmh=distancia/tiempo;
        System.out.println("La velocidad de su coche ha sido de "+kmh+" km/h");
    }
}
