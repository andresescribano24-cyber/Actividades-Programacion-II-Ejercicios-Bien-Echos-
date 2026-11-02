public class Ejercicio26 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        for (int[] fila : transpuesta) {
            for (int numero : fila) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }
}