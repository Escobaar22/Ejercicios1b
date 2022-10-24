import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class AreaTrinaguloCuadradoPentagono {
    public static void main (String [] args){
        int  opcion;
        double base, altura, area, perimetro;
        Scanner sr=new Scanner(System.in);
        System.out.println("Si quiere calcular el area de un triángulo pulse 1, para el cuadrado 2 y para el pentagono 3");
        opcion=sr.nextInt();
        if(opcion == 1){
            System.out.println("Introduzca el valor de la base del triángulo");
            base=sr.nextDouble();
            System.out.println("Introduce el valor de la altura del triángulo");
            altura=sr.nextDouble();
            area=base*altura/2;
            System.out.println("El area de su triángulo es "+area);
        } else if(opcion == 2) {
            System.out.println("Introduzca el valor del lado de un cuadrado");
            base=sr.nextDouble();
            area=base*base;
            System.out.println("El area de su cuadrado es "+area);
        } else{
            System.out.println("Introduzca el valor del lado del pentagono");
            base=sr.nextDouble();
            System.out.println("Introduzca el valor del apotema");
            altura=sr.nextDouble();
            area=5*base*altura/2;
            System.out.println("El area de su pentagono es "+area);
        }
    }
}
