import java.text.NumberFormat;
import java.util.Locale;

public class Desafio {
    public static void main(String[] args) {
        String nome ; nome= """
                 Nome: Joao Edaurdo
                """;
        String tipoConta ; tipoConta= """
                 Tipo de Conta: Corrente
                """;
        double valor = 1220.00;
        Locale locale = new Locale("pt", "BR"); 
        NumberFormat formatador = NumberFormat.getCurrencyInstance(locale); 
        String valorFormatado = formatador.format(valor); 


        System.out.println( nome+System.lineSeparator()+tipoConta+System.lineSeparator() + valorFormatado ); 
        
    }
}
