public class EjercicioEvaluable {
    public static void main(String[] args) {
            final int FILAS = 5;
            final int COLUMNAS = 5;
            int[][] tabla = new int[FILAS][COLUMNAS];
            int[][] tabla2  = new int[FILAS][COLUMNAS];
            RellenarArray(tabla, FILAS, COLUMNAS);
            RellenarArray2(tabla2, FILAS, COLUMNAS);
            SumaMatrizes(tabla, tabla2);
        }

        public static void RellenarArray(int[][] lista, int fil, int col) {
            for (int i = 0; i < fil; i++) {
                for (int j = 0; j < col; j++) {
                    lista[i][j] = (int) (Math.random() * 10);
                    System.out.print(lista[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
    }

    public static void RellenarArray2(int [][] lista, int fil, int col){
        for (int i = 0; i < fil; i++){
            for (int j = 0; j < col; j++){
                lista[i][j] = (int) (Math.random() * 10);
                System.out.print(lista[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("El resultado de la suma es:");
    }
    public static void SumaMatrizes(int[][] lista, int[][] lista2){
        int[][] resultado = new int[lista.length][lista[0].length];
        for (int i = 0; i < lista.length; i++){
            for (int j = 0; j <lista[i].length; j++){
                resultado[i][j] = lista[i][j]+lista2[i][j];
                System.out.print(resultado[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
