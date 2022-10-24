import java.util.Scanner;

public class ParImpar {
    public static void main (String [] args){
        int numero;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero= sr.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
