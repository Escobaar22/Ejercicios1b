import java.io.IOException;

public class MayusMinus {
    public static void main (String [] args) throws IOException {
        System.out.println("Introduce un caracter:");
        char car = (char) System.in.read();
        if (Character.isUpperCase(car)) {
            System.out.println("La letra es mayúscula");
        } else {
            System.out.println("La letra es minúscula");
        }
    }
}
