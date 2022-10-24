import java.util.Scanner;

public class Practica25 {
    public static void main(String[] args) {
        int nota;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introduce tu nota");
        nota=sr.nextInt();
        switch(nota){
            case 0,1,2,3,4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable bajo");
                break;
            case 8:
                System.out.println("Notable alto");
                break;
            case 9:
                System.out.println("Excelente");
                break;
            case 10:
                System.out.println("Matricula de honor");
                break;
        }
    }
}
