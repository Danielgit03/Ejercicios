import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el numero factorial que desea calcular : ");
        int numero = scan.nextInt();
        // para que el factorial inicie en 1 

        int factorial=1;
        int i=numero;

        while (i>0) {
            factorial *=i;
            i--;
        }

            System.out.println("El factorial de " + numero+ " es = " + factorial );

        




           

    }
}  
