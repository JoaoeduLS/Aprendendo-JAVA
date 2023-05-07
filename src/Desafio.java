import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner resposta= new Scanner(System.in); 
        
        String nome ; nome= """
                 Nome: Joao Edaurdo""";
        String tipoConta ; tipoConta= """
            Tipo de Conta: Corrente """;
        double valor1 = 1220.00;
        double resultado = valor1 ;
        valor1 = resultado;
        Locale locale = new Locale("pt", "BR"); 
        NumberFormat formatador = NumberFormat.getCurrencyInstance(locale); 
        String valorFormatado = formatador.format(valor1); 
        boolean sair =false;

        System.out.println(nome); 
        System.out.println(tipoConta); 
        System.out.println("Salario Inicial: "+ valorFormatado+"\n"); 


              while ( !sair) {
                
            
        System.out.println("OPERACOES\n");


        System.out.println("1- Consultar saldos\n"+"2- Receber valor\n"+"3- Transferir valor\n"+"4- Sair\n");
        System.out.println("Escolhar uma opercao: "); 
        int operecao= resposta.nextInt();

        System.lineSeparator();

        switch (operecao) {
            case 1:
                System.out.println(valorFormatado+"\n");
                break;
            case 2:
            
            System.out.println("Informe o valor a receber:");
            double novoValor= resposta.nextDouble();
            double resultado2 =novoValor+valor1;  
            Locale local2 = new Locale("pt", "BR"); 
            NumberFormat formata2 = NumberFormat.getCurrencyInstance(local2); 
            String valorFormat2 = formata2.format(resultado2);
            System.out.println("Saldo atualizado: "+valorFormat2+"\n");
                
                break;
            case 3:
             System.out.println("Informe o valor a receber:");
            double novoValor3= resposta.nextDouble();
            double resultado3 =novoValor3-valor1;  
            Locale local3 = new Locale("pt", "BR"); 
            NumberFormat formata3 = NumberFormat.getCurrencyInstance(local3); 
            String valorFormat3 = formata3.format(resultado3);
            System.out.println("Saldo atualizado: "+valorFormat3+"\n");
                
                break;
            case 4:
                sair=true;
            break;
            default:
                System.out.println("Opção inválida");
            break;
             }
        }
    }
}
