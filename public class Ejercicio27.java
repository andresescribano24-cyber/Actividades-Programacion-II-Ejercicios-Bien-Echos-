public class Ejercicio27 {
    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2},
            {3, 4}
        };

        int[][] matriz2 = {
            {5, 6},
            {7, 8}
        };

        int[][] resultado = new int[2][2];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        for (int[] fila : resultado) {
            for (int numero : fila) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }
}