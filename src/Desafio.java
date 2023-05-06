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
        double valor = 1220.00;
        Locale locale = new Locale("pt", "BR"); 
        NumberFormat formatador = NumberFormat.getCurrencyInstance(locale); 
        String valorFormatado = formatador.format(valor); 
        

        System.out.println(nome); 
        System.out.println(tipoConta); 
        System.out.println("Salario Inicial: "+ valorFormatado+"\n"); 

              
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
            double resultado =novoValor+valor;  
            Locale local = new Locale("pt", "BR"); 
            NumberFormat formata = NumberFormat.getCurrencyInstance(local); 
            String valorFormat = formata.format(resultado);
            System.out.println("Saldo atualizado: "+valorFormat+"\n");
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;

            default:
                break;
        }
    }
}
