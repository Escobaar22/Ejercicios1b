import java.util.Scanner;

public class RadioCircunferencia {
    public static void main (String [] args){
        double radio, peri, area;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introduce el radio de la circumferencia");
        radio=sr.nextDouble();
        peri= 2*Math.PI*radio;
        area= Math.PI*Math.pow(radio,2);
        System.out.println("El perimetro de tu circumferencia es "+peri+" y el area es "+area);
    }
}
