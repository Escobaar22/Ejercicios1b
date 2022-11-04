public class Matriz {
    public static void main(String[] args) {
        final int FILAS = 4;
        final int COLUMNAS = 5;
        int[][] numero = new int[FILAS][COLUMNAS];
        RellenarArray(numero, FILAS, COLUMNAS);
        MostrarArray(numero, FILAS, COLUMNAS);
    }

    public static void RellenarArray(int[][] lista, int fil, int col) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                lista[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void MostrarArray(int[][] lista, int fil, int col) {
        int suma = 0;
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(lista[i][j] + "\t");
                suma += lista[i][j];
            }
        }
        System.out.println("La suma es " + suma);
    }
}