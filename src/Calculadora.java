import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner valor= new Scanner(System.in);
        

        int numero =0;

        while (numero!= -1) {
            System.out.println("qual o primeiro valor, digite -1 para encerrar:");
            int valores1= valor.nextInt();
        
            System.out.println("qual o segundo valor, digite -1 para encerrar:");
            int valores2= valor.nextInt();



            if (valores1 == -1 || valores2 == -1) {

            break;
            }
            
            System.out.println("O resultado e :" + (valores1 + valores2));

            
       }
       
    }
}
