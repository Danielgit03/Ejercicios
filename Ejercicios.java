import java.util.Scanner;
public class Ejercicios {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1= scan.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2= scan.nextInt();

        System.out.println("Ingrese el tercer numero");
        int num3= scan.nextInt();

        int numeroMayor;
        if (num1>num2 && num1>num3) {
            numeroMayor=num1;
        }else if (num2>num1 && num2>num3){
           numeroMayor=num2;
            }
            else {
                numeroMayor=num3; 
            }
            System.out.println("el numero mayor es "+numeroMayor);
        }















    }
    

