import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Inicializar el factorial en 1
        int factorial = 1;

        // Crear una variable temporal para el ciclo
        int i = numero;

        // Calcular el factorial utilizando un ciclo while
        while (i > 0) {
            factorial *= i;
            i--; // Decrementar i en 1 en cada iteración
        }

        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        // Cerrar el scanner
        scanner.close();
    }
}
