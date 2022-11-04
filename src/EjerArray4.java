import java.util.Scanner;

public class EjerArray4 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("¿De que tamaño lo quieres?");
        final int TAMANO = sr.nextInt();
        int num[] = new int[TAMANO];
        rellenarNumAleatorioArray(num,0,9);
        mostrarArray(num);

    }
    public static void rellenarNumAleatorioArray (int lista[],int a,int b) {
        for (int i = 0; i < lista.length; i++) {
            //Generar el aleatorio y rellenamos
            lista[i] = (int) Math.floor(Math.random() * (a - b) + b);
        }
    }
    public static void mostrarArray(int lista[]){
        int suma=0;
        for(int i=0;i< lista.length;i++){
            suma+=lista[i];
            System.out.println("El indice "+i+" contiene el valor "+lista[i]);
        }
        System.out.println("La suma es "+suma);
    }//esto me ha roto el culo
}