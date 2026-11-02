import java.util.Arrays;

public class Ejercicio23 {
    public static void main(String[] args) {
        int[] arreglo = {5, 2, 8, 1, 3};

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arreglo));
    }
}