import java.util.Scanner;

public class testes {
//Para poder fazer digitacao no terminal essa e a forma 
    public static void main(String[] args) {
        try (Scanner test = new Scanner(System.in)) {
            System.out.print("Type your name: ");
            String name = test.nextLine();
            
            
//Para poder usar condicoes em strings e essa a forma
    if(name.equalsIgnoreCase("Joao Eduardo") )
    {
           System.out.println("yes ok ok !!!");
    }
    else {
       System.out.println("what is yor name?"); 
         }   
       } 
    }
}

