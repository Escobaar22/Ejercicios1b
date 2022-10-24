import java.util.Scanner;

public class CelciusFarenheit {
    public static void main (String [] args){
        double num1, num2;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introduce los ºC");
        num1=sr.nextDouble();
        num2 = num1*9/5 +32;
        System.out.println(num1+ "ºC son "+num2+" Farenheit");
    }
}
