import java.util.Arrays;

public class Ejercicio21 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4};

        for (int i = 0; i < arreglo.length / 2; i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arreglo));
    }
}