import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner valor= new Scanner(System.in); 

        int numero =0;
                //inserir os valores
        while (numero!= -1) {
            System.out.println("qual o primeiro valor, digite -1 para encerrar:");
            int valores1= valor.nextInt();
        
            System.out.println("qual o segundo valor, digite -1 para encerrar:");
            int valores2= valor.nextInt();


            if (valores1 == -1 || valores2 == -1) {
                //Encerra o loop se um dos valores for -1
            break;
            }
            
                //escolher a soma 
            System.out.println("escolha uma das somas 1=soma / 2=subtracao / 3=divisao / 4=multiplicao");
            int number =valor.nextInt();
           switch (number) {
            case 1:
                System.out.println("O resultado e :"+(valores1+valores2));
                break;
            case 2:
                System.out.println("O resultado e :"+(valores1-valores2));
                break;
            case 3:
                System.out.println("O resultado e :"+(valores1/valores2));
                break;
            case 4:
                System.out.println("O resultado e :"+(valores1*valores2));
                break;
           
            default:
                break;
           }   
       } 
    }
}
