import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        final int TAMANO=10;
        int lista[]=new int [TAMANO];
        Scanner sc=new Scanner(System.in);
        //cargamos el array con los datos del usuario
        for(int i=0; i<lista.length; i++){
            System.out.println("Introduce un número:");
            String texto=sc.next();
            lista[i]=Integer.parseInt(texto);//convierte el String a entero
        }
        //mostramos los datos del usuario
        for(int j=0; j<lista.length;j++){
            System.out.println("En el indice "+j+" contiene el valor "+lista[j]);
        }
    }
}
