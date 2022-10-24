import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double num1, num2, resultado=0;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introduzca el primer operando");
        num1=sr.nextDouble();
        System.out.println("Introduzca el operador");
        String operacion=sr.next();
        System.out.println("Introduzca el segundo operando");
        num2=sr.nextDouble();
        switch(operacion){

            case "+":
                resultado = num1 + num2;
                System.out.println("El resultado es: "+resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("El resultado es: "+resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("El resultado es: "+resultado);
                break;
            case "/":
                resultado = num1 / num2;
                System.out.println("El resultado es: "+resultado);
            default:
                System.out.println("Introduce una operación");
        }

    }
}
