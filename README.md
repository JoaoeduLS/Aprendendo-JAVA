# Introducao a JAVA

        Ola me chamo Joao e atraves da alura estarei me comprometendo a esta aprendendo a linguagem JAVA e a tambem esta publicando e mostrando meu proguesso espero que gostem!!

        Hello, my name is Joao and through this I am committing myself to learning the JAVA language and also publishing and showing my progress, I hope you like it!!

## Me desafiando a aprende e presquisando

- "\n" Para fazer o quebramento de linhas nas strings do println
- Sempre use o + para adiciona e para junta no println
- Para coloca o numero como um decimal completo e nescessario este exemplo

        import java.text.DecimalFormat;
        import java.util.Locale;

        public class ExemploDeFormatoDePreco {
                public static void main(String[] args) {
                        double preco = 12.3456;

                        DecimalFormat formatoPreco = (DecimalFormat) DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));
                         System.out.println("Preço: " + formatoPreco.format(preco));
                }
        }

- Para escrever uma String e o oposto de Int exemplo

        //Com valor

        int valor = 42;
        String valorString = String.valueOf(valor);
        System.out.println("O valor é: " + valorString);

        //Sem valor

        String Empresa = String.valueOf("Marvel Studio");

### Resultado do teste

        //PRIMEIRO TESTE COM O JAVA : lISTA

        import java.text.DecimalFormat;
        import java.util.Locale;

        public class PriProjeto {
        public static void main (String[] args){

        int Lancamento = 2022;
        String Empresa = String.valueOf("Marvel Studio");
        String NomedoFilme = String.valueOf("Homem Aranha");

        double preco = 18.3456;

        DecimalFormat formatoPreco = (DecimalFormat)
        DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Ano de Lancamento: " + Lancamento + "\nEmpresa: " + Empresa + "\nNome do Filme: " + NomedoFilme + "\nPreço: " + formatoPreco.format(preco) );

                }
        }

#### Para main e println mais rapido use:

- sout
- main

### Treinando true e false

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

- dica depois que terminei o treino:

        O código funciona bem para o propósito de verificar se o nome digitado pelo usuário é "joao". No entanto, é importante notar que o método equals() é sensível a maiúsculas e minúsculas. Se você quiser tornar a verificação de nome insensível a maiúsculas e minúsculas, você pode usar o método equalsIgnoreCase() ao invés do equals().

```
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

```

#### Para quando quiser usa mais de um if else use case:

```
int dia = 3;
String nomeDia;

switch (dia) {
   case 1:
      nomeDia = "domingo";
      break;
   case 2:
      nomeDia = "segunda-feira";
      break;
   case 3:
      nomeDia = "terça-feira";
      break;
   case 4:
      nomeDia = "quarta-feira";
      break;
   case 5:
      nomeDia = "quinta-feira";
      break;
   case 6:
      nomeDia = "sexta-feira";
      break;
   case 7:
      nomeDia = "sábado";
      break;
   default:
      nomeDia = "Dia inválido";
      break;
}

System.out.println("O dia " + dia + " é " + nomeDia);
```
