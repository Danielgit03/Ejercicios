import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el numero que desea la tabla de multiplicar : ");
        int num= scan.nextInt();


        for (int i=1;i<=10;i++){
            System.out.println(num + "x" +    i + "=" +(num*i));

        }
        
       
    }
}
