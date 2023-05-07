import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome completo do cliente: "); //Solicita ao cliente para informar o nome
        String cliente = sc.nextLine();                             //Atribui a 'cliente' o valor digitado

        String tipoDeConta = "Conta Corrente";

        System.out.println("Informe o valor do primeiro depósito: "); //Solicita um depósito inciial
        double saldo = sc.nextDouble();                               //Atribui ao saldo o valor digitado
        boolean sair = false;                                         //Inicializa a variavel 'sair' com o valor false

        //IMPRIMINDO AS INFORMAÇÕES DO CLIENTE
        System.out.println("****************************************************");
        System.out.println("Dados inciais do cliente: ");
        System.out.println();
        System.out.println("Nome:               " + cliente);
        System.out.println("Tipo de conta:      " + tipoDeConta);
        System.out.println("Saldo:              " + saldo);
        System.out.println();
        System.out.println("****************************************************");

        String menuDeOpcoes = """
                            Digite sua Opção
                            1- Consultar saldo
                            2- Depositar
                            3- Sacar
                            4- Sair
                            """;


        while (!sair) {     //enquanto 'sair' for false, ira continuar executando o codigo abaixo
            //Imprime as opções para mostrar ao cliente o que ele deve digitar
            System.out.println("\n" + menuDeOpcoes); // UTILIZANDO A STRING BLOCK NO LUGAR DE FAZER DIVERSOS sout's!
//            System.out.println("1- Consultar saldo");
//            System.out.println("2- Depositar");
//            System.out.println("3- Sacar");
//            System.out.println("4- Sair");
            // o \n serve para pular uma linha antes do texto
            System.out.println("\nDigite a opção desejada:"); //Solicita ao cliente que ele informa a opção
            int operacao = sc.nextInt();                    //Atribui a 'operacao' o valor digitar
            switch (operacao) {
                case 1: //caso o valor digitar seja 1
                    System.out.println("O saldo atual é: R$" + saldo);  //imprime o saldo atualizado
                    break;
                case 2:
                    System.out.println("Qual valor deseja depositar?"); //solicia ao cliente que informe o valor a depositar
                    double valor = sc.nextDouble(); //atribui a 'valor' o valor digitado pelo cliente
                    if (valor >= 1) {               //verifica se o valor é positivo
                        saldo += valor;             //some o valor digitado ao saldo
                        System.out.println("Depósito realizado com sucesso!");
                        System.out.println("Novo saldo: R$" + saldo);   //imprime o saldo atualizado
                    } else {
                        System.out.println("Por favor, informe um valor maior que 0");
                    }
                    break;
                case 3:
                    System.out.println("Quanto deseja sacar?");
                    double saque = sc.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("Novo saldo: R$" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar nosso sistema!"); //caso o cliente digite 4, o programa deve ser encerrado
                    sair = true;    //altera o valor de 'sair' para true para que possa sair do laço while
                    break;
                default:
                    System.out.println("Por favor, selecione uma opção válida.");
                    break;
            }
        }

    }
}