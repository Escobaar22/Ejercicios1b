import java.io.IOException;

public class CharChar {
    public static void main(String[] args) throws IOException {
        System.out.println("Introduce una letra:");
        char car1 = (char) System.in.read();
        System.in.read();
        System.out.println("Introduce otra letra");
        char car2 = (char) System.in.read();
        if (car1 == car2){
            System.out.println("Los caracteres son iguales");
        } else {
            System.out.println("Los caracteres no son iguales");
        }
    }
}
