import java.util.Scanner;

public class LeituraScanner {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);


        System.out.println("digite seu filme: ");
        String filme = leitura.nextLine();//para stings e texto

        System.out.println("qual ano de lancamento:");
        int anoDeLancamento= leitura.nextInt();//para numeros e valores

        System.out.println("qual avaliacao voce da a ao filme:");
        double avaliacao= leitura.nextDouble();//para valores decimais 

        
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
        System.out.println(filme);
    }
}
