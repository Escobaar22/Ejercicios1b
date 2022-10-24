import java.util.Scanner;

public class DobleTriple {
    public static void main (String [] args){
        int num1;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce un numero");
        num1=src.nextInt();

        System.out.println("El doble de "+num1+" es "+num1*2); //multiplicamos el num1 por 2
        System.out.println("El triple de "+num1+" es "+num1*3); //multiplicamos el num1 por 3
    }
}
