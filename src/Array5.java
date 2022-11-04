import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        final int TAMANO = 5;
        int lista[] = new int[TAMANO];
        int resultado=0;
        int valor;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce un número:");
            valor=sc.nextInt();
            lista[i]=valor;
            resultado+=lista[i];
        }
        System.out.println("El resulado de la suma es "+resultado);
    }
}
