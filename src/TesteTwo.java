import java.util.Random;
import java.util.Scanner;

public class TesteTwo {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        int aleatoria = new Random().nextInt(100);
        System.out.println("numero da jogada:");
        

        for (int i = 0; i < 5; i++) {
            System.out.println("Adivinhe o número tentativa " + i);
            int numero = leitura.nextInt();

            if (numero == aleatoria) {
                System.out.println("voce ganho");
            }
            else if(numero < aleatoria){
                System.out.println("tente um numero maior");
            }
            else if(numero > aleatoria){
                System.out.println("tente um numero menor");
            }
        }
        System.out.println("Número sorteado "+ aleatoria);
    }

    
    
    }
    

