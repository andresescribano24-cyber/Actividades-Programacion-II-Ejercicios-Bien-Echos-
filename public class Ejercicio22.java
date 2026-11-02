public class Ejercicio22 {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50};
        int numeroBuscado = 30;
        boolean encontrado = false;

        for (int numero : arreglo) {
            if (numero == numeroBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número está en el arreglo.");
        } else {
            System.out.println("El número no está en el arreglo.");
        }
    }
}