import java.util.Scanner;

public class EuroPeseta {
    public static void main (String [] args) {
        double num, opcion, resultado;
        Scanner sr=new Scanner(System.in);
        System.out.println("Si quiere pasarlo a pesetas pulse 1, si es a euros pulse 2");
        opcion=sr.nextDouble();
        System.out.println("Introduce el valor monetario");
        num=sr.nextDouble();
        if (opcion == 1){
            resultado=num*166.386;
            System.out.println(num+" euros son "+resultado+" pesetas");
        } else{
            resultado=num/166.386;
            System.out.println(num+" pesetas son "+resultado+" euros");
        }

    }
}
