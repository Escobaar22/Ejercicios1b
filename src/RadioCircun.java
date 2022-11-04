import java.util.Scanner;

public class RadioCircun {
    public static void main (String [] args){
        double radio;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introduce el radio de la circumferencia");
        radio=sr.nextDouble();
        CalcularPerimetro(radio);
        CalcularArea(radio);
    }
    public static void CalcularPerimetro (double r){
       double peri;
       peri= 2*Math.PI*r;
        System.out.println("El perimetro de la circunferencia es "+peri);
    }
    public static void CalcularArea (double r){
       double area;
       area= Math.PI*Math.pow(r,2);
       System.out.println("El area de la circunferencia es "+area);
    }
}