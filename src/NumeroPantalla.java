import java.util.Scanner;

public class NumeroPantalla {
    public static void main (String [] args){
        int num1, num2; //creamos variables
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce un numero");
        num1=src.nextInt();
        System.out.println("Introduce otro numero");
        num2=src.nextInt();
        System.out.println("Has introducido los numeros "+num1+" y "+num2);
    }
}
