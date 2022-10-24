import java.io.IOException;

public class ComparadorMinusculas {
    public static void main(String[] args) throws IOException {
        System.out.println("Introduce un caracter");
        char car1 = (char)System.in.read();
        System.in.read();
        System.out.println("Introduce otro caracter");
        char car2 = (char)System.in.read();
        if(Character.isLowerCase(car1)) {
            System.out.println("El primer caracter es minuscula");
            if (Character.isLowerCase(car2))
                System.out.println("El segundo caracter es minuscula");
            else {
                System.out.println("El segundo caracter no es minuscula");
            }
        }else{
            System.out.println("El primer caracter no es minuscula");
        }
    }
}
