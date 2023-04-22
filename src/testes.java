import java.util.Scanner;

public class testes {
//Para poder fazer digitacao nao terminal esse e o format cod.
    public static void main(String[] args) {
        try (Scanner testes = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = testes.nextLine();
            System.out.println();

            
//Para poder usar condicoes em strings e essa a forma
    if(nome.equals("joao") )
    {
           System.out.println("yes ok ok !!!");
    }
    else {
       System.out.println("what is yor name?"); 
         }   
       }
    }
}
