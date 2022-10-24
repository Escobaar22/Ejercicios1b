import java.util.Scanner;

public class Practica23 {
    public static void main(String[] args) {
        int dia;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introduce un dia de la semana");
        dia=sr.nextInt();
        switch(dia){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es un dia laboral");
                break;
            case 6:
            case 7:
                System.out.println("No es un dia laboral");
            default:
                System.out.println("El valor introducido es incorrecto");
        }
    }
}
