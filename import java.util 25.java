import java.util.Arrays;

public class Ejercicio25 {
    public static void main(String[] args) {
        int[] arreglo1 = {1, 3, 5};
        int[] arreglo2 = {2, 4, 6};

        int[] resultado = new int[arreglo1.length * 2];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i * 2] = arreglo1[i];
            resultado[i * 2 + 1] = arreglo2[i];
        }

        System.out.println(Arrays.toString(resultado));
    }
}