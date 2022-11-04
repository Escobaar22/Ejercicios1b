import java.util.Scanner;

public class Farent2 {
    public static void main(String[] args) {
        double num1;
        Scanner sr = new Scanner(System.in);
        System.out.println("Introduce los ºC");
        num1 = sr.nextDouble();
        CalcularFaren(num1);
    }
    public static void CalcularFaren(double n){
        double faren;
        faren = n*9/5 +32;
        System.out.println("Son "+faren+" Farenheit");
    }
}
