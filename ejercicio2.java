
public class ejercicio2 {
    public static void main(String[] args) {
        
        int ContadorPares=0 ;
    // numeros es la cantidad de  numeros que hayt del 1 al 100
        for (int numeros= 1;numeros <= 100;numeros++){
            
            if(numeros%2==0){
                ContadorPares++;
            }
          
        }


        System.out.println("La cantidad de numeros pares son del 1 al 100 son  = "+ ContadorPares);




    }


}
