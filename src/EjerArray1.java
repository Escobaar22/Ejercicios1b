import java.util.Scanner;

public class EjerArray1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero[]=new int [10];
        int minimo=Integer.MAX_VALUE, maximo=Integer.MIN_VALUE;
        int posicionMax=0, posicionMin=0;
        System.out.println("Introduce los 10 numeros:");
        for(int i =0; i< numero.length; i++){
            numero[i]=sc.nextInt();
            if(numero[i]<=minimo){
                minimo = numero[i];
                posicionMin=i+1;
            }
            if(numero[i]>=maximo){
                maximo = numero[i];
                posicionMax=i+1;
            }
        }
        System.out.println("El valor maximo es "+maximo+" y esta en la posicion " +posicionMax);
        System.out.println("El valor minimo es "+minimo+" y esta en la posicion " +posicionMin);
    }
}
