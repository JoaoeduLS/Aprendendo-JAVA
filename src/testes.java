import java.util.Scanner;

public class testes {
//Para poder fazer digitacao nao terminal esse e o format cod.
    public static void main(String[] args) {
        try (Scanner testes = new Scanner(System.in)) {
            System.out.print("Type your name: ");
            String nome = testes.nextLine();
            System.out.println();

            
//Para poder usar condicoes em strings e essa a forma
    if(nome.equalsIgnoreCase("Joao Eduardo") )
    {
           System.out.println("yes ok ok !!!");
    }
    else {
       System.out.println("what is yor name?"); 
         }   
       } 
    }
}
