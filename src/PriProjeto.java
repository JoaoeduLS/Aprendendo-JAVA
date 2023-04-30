//ATRIBUINDO VALORES
public class PriProjeto {
 public static void main (String[] args){
     System.out.println("Esse e o screen match");
     System.out.println("Filme: Homen Aranha: Marvel Studio");
    
    //CHAMANDO A VARIAVEL
    int anoDeLancamento = 2022;
    System.out.println("Ano de Lancamento:" + anoDeLancamento);
    
    //variavel que assume os valores true ou false
    /*boolean IncluidoNoPlano = true;
    double notaDoFilme  = 8.1;*/

    double media=(9.8 + 6.3+8.0)/3;

    System.out.println(media);
    String sionpse;
    sionpse = 
        """
        fime de ação historia do spider
        ano de lancamento:
        """ + anoDeLancamento;

    System.out.println(sionpse);

    int classificacao;
    classificacao= (int) (media/2);
    System.out.println(classificacao);
    

   /*  Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
    Utilize variáveis para representar os valores das temperaturas e imprima no console o 
    valor convertido de Celsius para Fahrenheit.*/


    int Celsius =  12;
    int Fahrenheit = 32;

    double resultado =  (Celsius *1.8) + Fahrenheit;

    System.out.println(resultado);
}
}
 