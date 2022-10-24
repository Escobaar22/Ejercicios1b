import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        String contra="megustanlospenes", contras;
        int intentos=3;
        boolean acertado=false;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introduce contraseña");
        for(int i=0; i<intentos && !acertado; i++){
            contras= sr.next();
            if(contras.equals(contra)){
                System.out.println("Enhorabuena, has acertado");
                acertado=true;
            }else{
                System.out.println("Sigue intentandolo");
            }
        }
    }
}
