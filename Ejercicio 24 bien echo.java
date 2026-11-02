
public class Ejercicio24 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 2, 3, 4, 4, 5};
        int[] resultado = new int[arreglo.length];
        int cantidad = 0;

        for (int i = 0; i < arreglo.length; i++) {
            boolean repetido = false;

            // Comprobar si el número ya está en resultado
            for (int j = 0; j < cantidad; j++) {
                if (arreglo[i] == resultado[j]) {
                    repetido = true;
                    break;
                }
            }

            // Si no está repetido, añadirlo
            if (!repetido) {
                resultado[cantidad] = arreglo[i];
                cantidad++;
            }
        }

        // Mostrar el resultado sin duplicados
        System.out.print("Arreglo sin duplicados: ");

        for (int i = 0; i < cantidad; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
```