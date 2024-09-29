import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("---------MENU----------");
        System.out.println("1.------------------SUMA");
        System.out.println("2.------------------RESTA");
        System.out.println("3.------------------MULTIPLICACION");
        System.out.println("4.------------------DIVISION");
        System.out.println("5.------------------MODULO");
        System.out.println("Ingrese el numero de la operacion q desea hacer : ");
        int operaciones= scan.nextInt();
        
        System.out.println("ingrese el primer numero ");
        double num1=scan.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2=scan.nextDouble();
        

        switch (operaciones) {
            case 1:
            double suma = num1+num2;
            System.out.println("El resultado de la suma es = "+suma);
                break;
                case 2:
                double resta = num1-num2;
                System.out.println("El resultado de la suma es = "+resta);
                break;
                case 3:
                double multiplicacion = num1*num2;
                System.out.println("El resultado de la suma es = "+multiplicacion);
                break;
                case 4:
                
                if (num2 !=0){
                    double division =  num1/num2;
                    System.out.println("El resultado de la division es = "+division);
                }else {
                    System.out.println("Error division entre 0 ");
                }
                
                
                break;
                case 5:
                double modulo= num1%num2;
                System.out.println("El resultado del modulo es = "+modulo);
                break;
            default:
                System.out.println("Numero no valido ");
                break;
        }



    }
}
